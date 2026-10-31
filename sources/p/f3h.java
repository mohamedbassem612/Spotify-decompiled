package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f3h implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lwe(this, (byte) 27));

    public f3h(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        f3h f3hVar = (f3h) this.c.getValue();
        return f3hVar != null ? f3hVar.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("filter_book_chapters_enabled", "collection-downloaded", a()));
    }
}
