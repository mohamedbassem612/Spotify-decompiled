package p;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mdy implements Iterable, Closeable {
    public final DataHolder a;
    public boolean b = false;
    public ArrayList c;

    public mdy(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public /* bridge */ /* synthetic */ Object c(int i, int i2) {
        return new a1o1(this.a, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final int e(int i) {
        if (i >= 0 && i < this.c.size()) {
            return ((Integer) this.c.get(i)).intValue();
        }
        hhg1.n(fd21.h(new StringBuilder(String.valueOf(i).length() + 42), "Position ", i, " is out of bounds for this buffer"));
        return 0;
    }

    public final void f() {
        synchronized (this) {
            try {
                if (!this.b) {
                    DataHolder dataHolder = this.a;
                    zod.s(dataHolder);
                    int i = dataHolder.h;
                    ArrayList arrayList = new ArrayList();
                    this.c = arrayList;
                    if (i > 0) {
                        arrayList.add(0);
                        int iJ = this.a.j(0);
                        DataHolder dataHolder2 = this.a;
                        dataHolder2.a0(0, "path");
                        String string = dataHolder2.d[iJ].getString(0, dataHolder2.c.getInt("path"));
                        for (int i2 = 1; i2 < i; i2++) {
                            int iJ2 = this.a.j(i2);
                            DataHolder dataHolder3 = this.a;
                            dataHolder3.a0(i2, "path");
                            String string2 = dataHolder3.d[iJ2].getString(i2, dataHolder3.c.getInt("path"));
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder("path".length() + 42 + String.valueOf(i2).length() + 14 + String.valueOf(iJ2).length());
                                sb.append("Missing value for markerColumn: ");
                                sb.append("path");
                                sb.append(", at row: ");
                                sb.append(i2);
                                sb.append(", for window: ");
                                sb.append(iJ2);
                                throw new NullPointerException(sb.toString());
                            }
                            if (!string2.equals(string)) {
                                this.c.add(Integer.valueOf(i2));
                                string = string2;
                            }
                        }
                    }
                    this.b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getCount() {
        f();
        return this.c.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new owq(this);
    }
}
