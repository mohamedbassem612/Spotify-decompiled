package p;

import android.media.session.MediaSession;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hi61 {
    public static final String b;
    public static final String c;
    public final ki61 a;

    static {
        hph0.a("media3.session");
        String str = zoi1.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public hi61(int i, int i2, int i3, String str, kh70 kh70Var, Bundle bundle, MediaSession.Token token, String str2) {
        this.a = new ki61(i, i2, i3, str, kh70Var, bundle, token, str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hi61) {
            return this.a.equals(((hi61) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
