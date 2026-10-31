package p;

import android.view.KeyEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cpa0 {
    public final KeyEvent a;

    public /* synthetic */ cpa0(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ cpa0 a(KeyEvent keyEvent) {
        return new cpa0(keyEvent);
    }

    public final /* synthetic */ KeyEvent b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cpa0) {
            return u890.j(this.a, ((cpa0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ")";
    }
}
