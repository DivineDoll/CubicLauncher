package git.artdeell.cubic.game.platform.cursor;

import git.artdeell.cubic.game.platform.input.PlatformGrabListener;

/**
 * Platform cursor implementor. Receives cursor updates
 */
public interface PlatformCursorImplementor extends PlatformGrabListener {
    /**
     * Update cursor position on the screen
     */
    void onCursorPosition();

    /**
     * Update cursor drawable on the screen
     */
    void onCursorChanged();
}
