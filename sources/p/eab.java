package p;

import android.content.res.Resources;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eab implements l03 {
    public final Resources a;

    public eab(Resources resources) {
        this.a = resources;
    }

    @Override // p.l03
    public final String b() {
        return this.a.getString(2131952142);
    }

    @Override // p.l03
    public final lik1 e() {
        return nik1.v6;
    }

    @Override // p.l03
    public final List f() {
        return z6x.a;
    }

    @Override // p.l03
    public final String g() {
        return this.a.getString(2131952140);
    }

    @Override // p.l03
    public final n6r0 h() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("BLUEJAY_DISCLOSURE_SHEET", "bluejay/disclosure-sheet", 230, "bluejay");
    }

    @Override // p.l03
    public final String i() {
        return this.a.getString(2131952141);
    }
}
