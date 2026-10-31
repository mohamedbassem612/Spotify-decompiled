package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class zs5 extends cv5 {
    public static final ys5 Companion = new ys5();
    public Integer b;

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public zs5(PlayerState playerState) {
        int i;
        Companion.getClass();
        if (playerState == null) {
            i = 0;
        } else if (playerState.options().repeatingTrack()) {
            i = 1;
        } else if (playerState.options().repeatingContext()) {
            i = 2;
        } else {
            i = 0;
        }
        this(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs5) && u890.j(this.b, ((zs5) obj).b);
    }

    public final int hashCode() {
        Integer num = this.b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public zs5(Integer num) {
        this.b = num;
    }
}
