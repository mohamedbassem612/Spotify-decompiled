package p;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ki61 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f82p;
    public static final String q;
    public static final String r;
    public static final String s;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final IBinder f;
    public final Bundle g;
    public final MediaSession.Token h;

    static {
        String str = zoi1.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        f82p = Integer.toString(7, 36);
        q = Integer.toString(8, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(10, 36);
    }

    public ki61(int i2, int i3, int i4, String str, kh70 kh70Var, Bundle bundle, MediaSession.Token token, String str2) {
        str.getClass();
        IBinder iBinderAsBinder = kh70Var.asBinder();
        bundle.getClass();
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
        this.f = iBinderAsBinder;
        this.g = bundle;
        this.h = token;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ki61)) {
            return false;
        }
        ki61 ki61Var = (ki61) obj;
        return this.a == ki61Var.a && this.b == ki61Var.b && this.c == ki61Var.c && TextUtils.equals(this.d, ki61Var.d) && TextUtils.equals("", "") && Objects.equals(this.f, ki61Var.f) && Objects.equals(this.h, ki61Var.h) && Objects.equals(this.e, ki61Var.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, "", null, this.f, this.h, this.e);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.b + " interfaceVersion=" + this.c + " service= IMediaSession=" + this.f + " extras=" + this.g + "}";
    }
}
