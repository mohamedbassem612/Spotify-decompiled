package p;

import com.spotify.player.model.command.SeekToCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class nuz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SeekToCommand.Relative.values().length];
        try {
            iArr[SeekToCommand.Relative.BEGINNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SeekToCommand.Relative.CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SeekToCommand.Relative.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
