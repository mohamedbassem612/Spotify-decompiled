package p;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vdu {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public rl1 g;
    public int h;
    public final /* synthetic */ ceu i;

    public vdu(ceu ceuVar, String str) {
        this.i = ceuVar;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final xdu a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ceu ceuVar = this.i;
            if (i >= size) {
                this.h++;
                return new xdu(ceuVar, this);
            }
            if (!ero1.j(ceuVar.Q0, (s8s0) arrayList.get(i))) {
                try {
                    ceuVar.z(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
