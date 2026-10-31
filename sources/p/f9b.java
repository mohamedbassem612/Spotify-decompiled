package p;

import android.content.res.Resources;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f9b implements l03 {
    public final Resources a;

    public f9b(Resources resources) {
        this.a = resources;
    }

    public final String b() {
        return this.a.getString(2131952144);
    }

    public final lik1 e() {
        return nik1.v6;
    }

    public final List f() {
        return Collections.singletonList(new r7u(this.a.getString(2131952139), "https://www.spotify.com/legal/privacy-policy"));
    }

    public final n6r0 h() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("BLUEJAY_DISCLOSURE_SHEET", "bluejay/disclosure-sheet", 230, "bluejay");
    }

    public final String i() {
        return this.a.getString(2131952143);
    }
}
