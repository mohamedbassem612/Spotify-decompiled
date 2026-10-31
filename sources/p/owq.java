package p;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class owq implements Iterator {
    public final mdy a;
    public int b = -1;

    public owq(mdy mdyVar) {
        this.a = mdyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iIntValue;
        int iIntValue2;
        if (!hasNext()) {
            int i = this.b;
            bhn0.t(gvg.l(new StringBuilder(String.valueOf(i).length() + 35), "Cannot advance the iterator beyond ", i));
            return null;
        }
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        mdy mdyVar = this.a;
        DataHolder dataHolder = mdyVar.a;
        mdyVar.f();
        int iE = mdyVar.e(i3);
        int i4 = 0;
        if (i3 >= 0 && i3 != mdyVar.c.size()) {
            if (i3 == mdyVar.c.size() - 1) {
                zod.s(dataHolder);
                iIntValue = dataHolder.h;
                iIntValue2 = ((Integer) mdyVar.c.get(i3)).intValue();
            } else {
                iIntValue = ((Integer) mdyVar.c.get(i2 + 2)).intValue();
                iIntValue2 = ((Integer) mdyVar.c.get(i3)).intValue();
            }
            i4 = iIntValue - iIntValue2;
            if (i4 == 1) {
                int iE2 = mdyVar.e(i3);
                zod.s(dataHolder);
                dataHolder.j(iE2);
                i4 = 1;
            }
        }
        return mdyVar.c(iE, i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
