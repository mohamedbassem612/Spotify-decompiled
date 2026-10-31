package p;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wxs0 implements rij0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public wxs0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static wxs0 d(izr0 izr0Var) {
        int iQ = izr0Var.q();
        String strP = asj0.p(izr0Var.C(izr0Var.q(), StandardCharsets.US_ASCII));
        String strC = izr0Var.C(izr0Var.q(), StandardCharsets.UTF_8);
        int iQ2 = izr0Var.q();
        int iQ3 = izr0Var.q();
        int iQ4 = izr0Var.q();
        int iQ5 = izr0Var.q();
        int iQ6 = izr0Var.q();
        byte[] bArr = new byte[iQ6];
        izr0Var.o(0, bArr, iQ6);
        return new wxs0(iQ, strP, strC, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // p.rij0
    public final void b(upq upqVar) {
        upqVar.a(this.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wxs0.class != obj.getClass()) {
            return false;
        }
        wxs0 wxs0Var = (wxs0) obj;
        return this.a == wxs0Var.a && this.b.equals(wxs0Var.b) && this.c.equals(wxs0Var.c) && this.d == wxs0Var.d && this.e == wxs0Var.e && this.f == wxs0Var.f && this.g == wxs0Var.g && Arrays.equals(this.h, wxs0Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((cy30.d(cy30.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
