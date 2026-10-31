package p;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hv7 {
    public final b18 c;
    public boolean e;
    public boolean f;
    public boolean h;
    public int i;
    public final ArrayList a = new ArrayList();
    public final rgr b = new rgr();
    public c18 d = c18.e;
    public ByteBuffer g = f18.a;

    public hv7(hfb hfbVar, bg11 bg11Var) {
        this.c = new b18(bg11Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final ByteBuffer a() throws ExportException {
        boolean z;
        ByteBuffer byteBuffer;
        boolean z2;
        rgr rgrVar = this.b;
        boolean z3 = false;
        if (this.f) {
            z = true;
        } else {
            if (!this.e) {
                try {
                    rgrVar.d(this.d);
                    this.e = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw ExportException.b(e, "Error while configuring mixer");
                }
            }
            this.f = true;
            ListIterator listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                gv7 gv7Var = (gv7) listIterator.next();
                if (gv7Var.b == -1) {
                    jv7 jv7Var = gv7Var.a;
                    if (jv7Var.m) {
                        listIterator.remove();
                        this.i--;
                    } else {
                        try {
                            jv7Var.j();
                            long j = jv7Var.e.get();
                            if (j == -9223372036854775807L) {
                                this.f = false;
                            } else if (j == Long.MIN_VALUE) {
                                gv7Var.b = os00.INVALID_ID;
                                this.i--;
                            } else {
                                gv7Var.b = rgrVar.a(jv7Var.a, j);
                            }
                        } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                            throw ExportException.b(e2, "Unhandled format while adding source " + gv7Var.b);
                        }
                    }
                }
            }
            z = this.f;
        }
        if (!z) {
            return f18.a;
        }
        if (!this.b.e()) {
            ListIterator listIterator2 = this.a.listIterator();
            while (listIterator2.hasNext()) {
                gv7 gv7Var2 = (gv7) listIterator2.next();
                int i = gv7Var2.b;
                rgr rgrVar2 = this.b;
                rgrVar2.c();
                boolean z4 = rgrVar2.a.indexOfKey(i) >= 0;
                jv7 jv7Var2 = gv7Var2.a;
                if (!z4) {
                    z2 = jv7Var2.m;
                } else if (jv7Var2.o()) {
                    rgr rgrVar3 = this.b;
                    rgrVar3.c();
                    long j2 = rgrVar3.j;
                    SparseArray sparseArray = rgrVar3.a;
                    String str = zoi1.a;
                    dm5.z(sparseArray.indexOfKey(i) >= 0, "Source not found.");
                    rgrVar3.j = Math.max(j2, ((qgr) sparseArray.get(i)).a);
                    rgrVar3.a.delete(i);
                    LinkedHashMap linkedHashMap = x8r.a;
                    synchronized (x8r.class) {
                    }
                    if (!rgrVar3.k && rgrVar3.e()) {
                        x8r.a();
                        rgrVar3.k = true;
                    }
                    gv7Var2.b = os00.INVALID_ID;
                    this.i--;
                    z2 = jv7Var2.m;
                } else {
                    z2 = false;
                }
                if (z2) {
                    listIterator2.remove();
                }
            }
            for (gv7 gv7Var3 : this.a) {
                int i2 = gv7Var3.b;
                try {
                    this.b.f(gv7Var3.a.j(), i2);
                } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                    throw ExportException.b(e3, "AudioGraphInput (sourceId=" + i2 + ") reconfiguration");
                }
            }
        }
        if (!this.g.hasRemaining()) {
            rgr rgrVar4 = this.b;
            rgrVar4.c();
            if (rgrVar4.e()) {
                byteBuffer = f18.a;
            } else {
                long jMin = rgrVar4.i;
                if (rgrVar4.a.size() == 0) {
                    jMin = Math.min(jMin, rgrVar4.j);
                }
                for (int i3 = 0; i3 < rgrVar4.a.size(); i3++) {
                    jMin = Math.min(jMin, ((qgr) rgrVar4.a.valueAt(i3)).a);
                }
                if (jMin <= rgrVar4.h) {
                    byteBuffer = f18.a;
                } else {
                    m1d m1dVar = rgrVar4.e[0];
                    long jMin2 = Math.min(jMin, m1dVar.b);
                    ByteBuffer byteBufferDuplicate = ((ByteBuffer) m1dVar.c).duplicate();
                    byteBufferDuplicate.position(((int) (rgrVar4.h - m1dVar.a)) * rgrVar4.c.d).limit(((int) (jMin2 - m1dVar.a)) * rgrVar4.c.d);
                    ByteBuffer byteBufferOrder = byteBufferDuplicate.slice().order(ByteOrder.nativeOrder());
                    if (jMin2 == m1dVar.b) {
                        m1d[] m1dVarArr = rgrVar4.e;
                        m1d m1dVar2 = m1dVarArr[1];
                        m1dVarArr[0] = m1dVar2;
                        m1dVarArr[1] = rgrVar4.b(m1dVar2.b);
                    }
                    rgrVar4.h = jMin2;
                    rgrVar4.g = Math.min(rgrVar4.i, jMin2 + ((long) rgrVar4.d));
                    byteBufferOrder.remaining();
                    LinkedHashMap linkedHashMap2 = x8r.a;
                    synchronized (x8r.class) {
                    }
                    if (!rgrVar4.k && rgrVar4.e()) {
                        x8r.a();
                        rgrVar4.k = true;
                    }
                    byteBuffer = byteBufferOrder;
                }
            }
            this.g = byteBuffer;
        }
        ByteBuffer byteBufferD = this.g;
        if (this.c.f()) {
            if (!this.g.hasRemaining() && this.i == 0 && this.b.e()) {
                z3 = true;
            }
            b18 b18Var = this.c;
            if (z3) {
                b18Var.h();
            } else {
                b18Var.i(this.g);
            }
            byteBufferD = this.c.d();
        }
        byteBufferD.position();
        byteBufferD.remaining();
        LinkedHashMap linkedHashMap3 = x8r.a;
        synchronized (x8r.class) {
        }
        if (b() && !this.h) {
            x8r.a();
            this.h = true;
        }
        return byteBufferD;
    }

    public final boolean b() {
        boolean zE = !this.g.hasRemaining() && this.i == 0 && this.b.e();
        b18 b18Var = this.c;
        if (b18Var.f()) {
            zE = b18Var.e();
        }
        if (zE && !this.h) {
            x8r.a();
            this.h = true;
        }
        return zE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final jv7 c(e4w e4wVar, ie30 ie30Var) throws ExportException {
        dm5.m(ie30Var.M != -1);
        try {
            jv7 jv7Var = new jv7(this.d, e4wVar, ie30Var);
            if (Objects.equals(this.d, c18.e)) {
                c18 c18Var = jv7Var.a;
                this.d = c18Var;
                this.c.a(c18Var);
                b18 b18Var = this.c;
                d18 d18Var = new d18((byte) 0);
                d18Var.a = 0L;
                b18Var.b(d18Var.i());
                LinkedHashMap linkedHashMap = x8r.a;
                synchronized (x8r.class) {
                }
            }
            this.a.add(new gv7(jv7Var));
            this.i++;
            Integer.toHexString(jv7Var.hashCode());
            LinkedHashMap linkedHashMap2 = x8r.a;
            synchronized (x8r.class) {
            }
            return jv7Var;
        } catch (AudioProcessor$UnhandledAudioFormatException e) {
            throw ExportException.b(e, "Error while registering input " + this.a.size());
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        fv7 fv7Var = new fv7((byte) 0);
        Iterator it = arrayList.iterator();
        it.getClass();
        ao90 ao90Var = new ao90(it, fv7Var);
        while (ao90Var.hasNext()) {
            jv7 jv7Var = ((gv7) ao90Var.next()).a;
            dm5.y(!jv7Var.m);
            jv7Var.g.j();
            jv7Var.h.j();
            jv7Var.d.clear();
            jv7Var.b.clear();
            jv7Var.c.clear();
            jv7Var.m = true;
            Integer.toHexString(jv7Var.hashCode());
            LinkedHashMap linkedHashMap = x8r.a;
            synchronized (x8r.class) {
            }
        }
        this.a.clear();
        rgr rgrVar = this.b;
        rgrVar.a.clear();
        rgrVar.b = 0;
        c18 c18Var = c18.e;
        rgrVar.c = c18Var;
        rgrVar.d = -1;
        rgrVar.e = new m1d[0];
        rgrVar.f = -9223372036854775807L;
        rgrVar.g = -1L;
        rgrVar.h = 0L;
        rgrVar.i = Long.MAX_VALUE;
        rgrVar.j = 0L;
        rgrVar.k = false;
        x8r.a();
        this.c.j();
        this.i = 0;
        this.g = f18.a;
        this.d = c18Var;
        this.h = false;
        x8r.a();
    }
}
