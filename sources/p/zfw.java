package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zfw implements bgw {
    public final String a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public zfw(String str, String str2, int i, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = linkedHashMap;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfw)) {
            return false;
        }
        zfw zfwVar = (zfw) obj;
        return this.a.equals(zfwVar.a) && this.b.equals(zfwVar.b) && this.c == zfwVar.c && this.d.equals(zfwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
