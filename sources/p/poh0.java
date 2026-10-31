package p;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class poh0 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f114p;
    public final UUID a;
    public final Uri b;
    public final j380 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final b380 g;
    public final byte[] h;

    static {
        String str = zoi1.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        f114p = Integer.toString(7, 36);
    }

    public poh0(ooh0 ooh0Var) {
        dm5.y((ooh0Var.c && ((Uri) ooh0Var.e) == null) ? false : true);
        UUID uuid = (UUID) ooh0Var.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) ooh0Var.e;
        this.c = ooh0Var.f;
        this.d = ooh0Var.a;
        this.f = ooh0Var.c;
        this.e = ooh0Var.b;
        this.g = (b380) ooh0Var.g;
        byte[] bArr = (byte[]) ooh0Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poh0)) {
            return false;
        }
        poh0 poh0Var = (poh0) obj;
        if (this.a.equals(poh0Var.a) && Objects.equals(this.b, poh0Var.b) && Objects.equals(this.c, poh0Var.c) && this.d == poh0Var.d && this.f == poh0Var.f && this.e == poh0Var.e) {
            b380 b380Var = poh0Var.g;
            b380 b380Var2 = this.g;
            b380Var2.getClass();
            if (z1p1.j(b380Var2, b380Var) && Arrays.equals(this.h, poh0Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
