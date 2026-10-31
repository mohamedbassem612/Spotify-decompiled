package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rme extends qme {
    public final /* synthetic */ byte a;
    public final char b;

    public /* synthetic */ rme(char c, byte b) {
        this.a = b;
        this.b = c;
    }

    public final boolean d(char c) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return c == this.b;
            default:
                return c != this.b;
        }
    }

    @Override // p.qme
    public final xme e() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new rme(this.b, (byte) 1);
            default:
                return new rme(this.b, (byte) 0);
        }
    }

    public final String toString() {
        byte b = this.a;
        char c = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "CharMatcher.is('" + xme.g(c) + "')";
            default:
                return "CharMatcher.isNot('" + xme.g(c) + "')";
        }
    }
}
