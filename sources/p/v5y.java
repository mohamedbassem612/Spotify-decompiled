package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v5y implements u5y {
    public final Class a;
    public final byte b;
    public final w5y c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public v5y(Class cls, String str, int i, w5y w5yVar) {
        this.a = cls;
        this.d = str;
        this.b = i;
        this.c = w5yVar;
    }

    @Override // p.u5y
    public final Observable a(Object obj) {
        return this.c.a(obj);
    }

    @Override // p.u5y
    public final int b() {
        return this.b;
    }

    @Override // p.u5y
    public final Class c() {
        return this.a;
    }

    @Override // p.u5y
    public final String getUri() {
        return this.d;
    }
}
