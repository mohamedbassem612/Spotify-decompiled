package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hz10 implements o2r {
    public boolean N0;
    public boolean P0;
    public final ArrayList X;
    public boolean Y;
    public boolean Z;
    public final f520 a;
    public final r590 b;
    public final iru c;
    public final URL d;
    public final boolean e;
    public long g;
    public n3r h;
    public ebc i;
    public long t;
    public long f = -1;
    public boolean O0 = true;

    public hz10(f520 f520Var, r590 r590Var, iru iruVar, URL url, boolean z) {
        this.a = f520Var;
        this.b = r590Var;
        this.c = iruVar;
        this.d = url;
        this.e = z;
        this.X = p7h.O(new yeg1[]{r590Var});
    }

    public final void a(yeg1 yeg1Var) {
        this.X.add(yeg1Var);
    }

    public final n3r c() {
        n3r n3rVar = this.h;
        if (n3rVar != null) {
            return n3rVar;
        }
        u890.C("dataSpec");
        throw null;
    }

    public final void close() {
        f520 f520Var;
        if (this.Z) {
            return;
        }
        this.Z = true;
        c().toString();
        Thread.currentThread().getId();
        if (this.P0 && (f520Var = this.a) != null) {
            f520Var.a();
        }
        if (this.N0) {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((yeg1) it.next()).e(this, c(), this.O0);
            }
        }
    }

    public final Map e() {
        return b7x.a;
    }

    public final Uri getUri() {
        return c().a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[LOOP:0: B:19:0x003e->B:21:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:1: B:24:0x0058->B:26:0x005e, LOOP_END] */
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        rb01 rb01VarC;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        if (i2 == 0) {
            return 0;
        }
        long jMin = i2;
        long j = this.f;
        if (j != -1) {
            long j2 = j - this.g;
            if (j2 != 0) {
                jMin = Math.min(jMin, j2);
                try {
                    ebc ebcVar = this.i;
                    ebcVar.getClass();
                    rb01VarC = ebcVar.c(i, bArr, (int) jMin);
                    i3 = rb01VarC.a;
                    i4 = rb01VarC.c;
                    i5 = rb01VarC.b;
                    if (i3 != -1) {
                        this.g += (long) i3;
                        arrayList = this.X;
                        if (i5 > 0) {
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((yeg1) it2.next()).m(this, c(), false, i5);
                            }
                        }
                        if (i4 > 0) {
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((yeg1) it.next()).m(this, c(), true, i4);
                            }
                        }
                        if (rb01VarC.d && !this.Y) {
                            this.b.z0();
                            this.Y = true;
                        }
                        return i3;
                    }
                } catch (IOException e) {
                    this.P0 = true;
                    throw e;
                }
            }
        } else {
            ebc ebcVar2 = this.i;
            ebcVar2.getClass();
            rb01VarC = ebcVar2.c(i, bArr, (int) jMin);
            i3 = rb01VarC.a;
            i4 = rb01VarC.c;
            i5 = rb01VarC.b;
            if (i3 != -1) {
                this.g += (long) i3;
                arrayList = this.X;
                if (i5 > 0) {
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((yeg1) it2.next()).m(this, c(), false, i5);
                    }
                }
                if (i4 > 0) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((yeg1) it.next()).m(this, c(), true, i4);
                    }
                }
                if (rb01VarC.d) {
                    this.b.z0();
                    this.Y = true;
                }
                return i3;
            }
        }
        return -1;
    }

    public final long t(n3r n3rVar) {
        this.h = n3rVar;
        this.t = n3rVar.f;
        this.g = 0L;
        boolean zBooleanValue = false;
        this.Z = false;
        this.N0 = false;
        this.O0 = true;
        this.P0 = false;
        n3rVar.toString();
        Thread.currentThread().getId();
        if (this.e) {
            try {
                Boolean bool = (Boolean) this.c.d(this.d).blockingGet();
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            } catch (Exception e) {
                Logger.l(e, "Failed cache check for progressive media, defaulting to network transfer", new Object[0]);
            }
            this.O0 = !zBooleanValue;
        }
        ArrayList arrayList = this.X;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yeg1) it.next()).t(this, n3rVar, this.O0);
        }
        f520 f520Var = this.a;
        f520Var.getClass();
        this.i = new ebc(this.t, f520Var.g, f520Var.f, new c4z(2, f520Var, f520.class, "requestData", "requestData(JJ)Lio/reactivex/rxjava3/core/Observable;", 0, (byte) 4), f520Var.i);
        Long l = f520Var.f;
        this.f = l != null ? l.longValue() : -1L;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((yeg1) it2.next()).j(this, n3rVar, this.O0);
        }
        this.N0 = true;
        return this.f;
    }
}
