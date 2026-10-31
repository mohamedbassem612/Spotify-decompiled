package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kay implements aik1 {
    public final int a;
    public final Date b;
    public final Date c;

    public kay(int i, Date date, Date date2) {
        this.a = i;
        this.b = date;
        this.c = date2;
    }

    @Override // p.aik1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kay)) {
            return false;
        }
        kay kayVar = (kay) obj;
        return this.a == kayVar.a && this.b.equals(kayVar.b) && this.c.equals(kayVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
