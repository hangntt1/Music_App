package hcmute.edu.vn.duan_gk.playback;

import android.app.Activity;
import android.media.MediaPlayer;



import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import hcmute.edu.vn.duan_gk.activities.ArtistsActivity;
import hcmute.edu.vn.duan_gk.models.Album;
import hcmute.edu.vn.duan_gk.models.Song;

/**
 * Allows {@link ArtistsActivity} to control media playback of {@link MediaPlayerHolder}.
 */
public interface PlayerAdapter {

    void initMediaPlayer(@NonNull final Song song);

    void release();

    boolean isMediaPlayer();

    boolean isPlaying();

    void resumeOrPause();

    void reset();

    boolean isReset();

    void instantReset();

    Song getCurrentSong();

    String getNavigationArtist();

    void setNavigationArtist(@NonNull final String navigationArtist);

    Album getNavigationAlbum();

    void setNavigationAlbum(@Nullable final Album navigationAlbum);

    void setCurrentSong(@NonNull final Song song, @NonNull final List<Song> songs);

    void skip(final boolean isNext);

    void openEqualizer(@NonNull final Activity activity);

    void seekTo(final int position);

    void setPlaybackInfoListener(final PlaybackInfoListener playbackInfoListener);

    @PlaybackInfoListener.State
    int getState();

    int getPlayerPosition();

    void registerNotificationActionsReceiver(final boolean isRegister);

    MediaPlayer getMediaPlayer();

    void onPauseActivity();

    void onResumeActivity();
}