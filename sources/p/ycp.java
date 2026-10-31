package p;

import com.ravelin.core.util.security.RootCheckerNative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ycp implements jly0 {
    public final /* synthetic */ byte a;

    public ycp(ytw0 ytw0Var) {
        this.a = (byte) 2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new e241();
            case 1:
                return new xug0();
            default:
                return new RootCheckerNative();
        }
    }
}
