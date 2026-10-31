package p;

import com.google.protobuf.Timestamp;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w4g implements yue1 {
    public final ArrayList a;
    public final String b;
    public final a5g c;
    public final String d;
    public final Timestamp e;

    public w4g(ArrayList arrayList, String str, a5g a5gVar, String str2, Timestamp timestamp) {
        this.a = arrayList;
        this.b = str;
        this.c = a5gVar;
        this.d = str2;
        this.e = timestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4g)) {
            return false;
        }
        w4g w4gVar = (w4g) obj;
        return this.a.equals(w4gVar.a) && u890.j(this.b, w4gVar.b) && this.c.equals(w4gVar.c) && this.d.equals(w4gVar.d) && this.e.equals(w4gVar.e);
    }

    @Override // p.yue1
    public final String getId() {
        return "chips-section";
    }

    public final int hashCode() {
        int iF = kaa0.f(0, this.a.hashCode() * 31, 31);
        String str = this.b;
        return this.e.hashCode() + cy30.d((this.c.hashCode() + ((iF + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.d);
    }
}
