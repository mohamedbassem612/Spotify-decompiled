package p;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class udu {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public y861 g;
    public int h;
    public long i;
    public final /* synthetic */ beu j;

    public udu(beu beuVar, String str) {
        this.j = beuVar;
        this.a = str;
        beuVar.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final wdu a() {
        TimeZone timeZone = z4n1.a;
        if (!this.e) {
            return null;
        }
        beu beuVar = this.j;
        if (!beuVar.Y && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            try {
                tdu tduVarJ = beuVar.b.c.j((s8s0) this.c.get(i));
                if (!beuVar.Y) {
                    this.h++;
                    tduVarJ = new tdu(tduVarJ, beuVar, this);
                }
                arrayList.add(tduVarJ);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w4n1.b((fka1) it.next());
                }
                try {
                    beuVar.o(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new wdu(this.j, this.a, this.i, arrayList);
    }
}
