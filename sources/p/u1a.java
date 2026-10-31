package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u1a extends z1a {
    public final View a;
    public final byte b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public u1a(View view, int i, String str) {
        this.a = view;
        this.b = i;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final View b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1a)) {
            return false;
        }
        u1a u1aVar = (u1a) obj;
        return this.a.equals(u1aVar.a) && this.b == u1aVar.b && this.c.equals(u1aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
