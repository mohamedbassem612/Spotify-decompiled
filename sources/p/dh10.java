package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dh10 extends RecyclerView {
    /* JADX WARN: Multi-variable type inference failed */
    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    public final boolean isPaddingOffsetRequired() {
        return true;
    }
}
