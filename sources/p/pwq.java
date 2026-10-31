package p;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pwq {
    public final DataHolder a;
    public final int b;
    public final int c;

    public pwq(DataHolder dataHolder, int i) {
        zod.s(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        zod.w(z);
        this.b = i;
        this.c = dataHolder.j(i);
    }

    public final int b() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.a0(i, "event_type");
        return dataHolder.d[this.c].getInt(i, dataHolder.c.getInt("event_type"));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pwq) {
            pwq pwqVar = (pwq) obj;
            if (k8p1.h(Integer.valueOf(pwqVar.b), Integer.valueOf(this.b)) && k8p1.h(Integer.valueOf(pwqVar.c), Integer.valueOf(this.c)) && pwqVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
