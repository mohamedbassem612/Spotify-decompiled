package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.download.esperanto.proto.EsDownload;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gr51 implements o2r {
    public boolean N0;
    public gq51 O0;
    public boolean P0;
    public boolean Q0;
    public Long S0;
    public long X;
    public iq51 Y;
    public ByteArrayInputStream Z;
    public final m0u0 a;
    public final String b;
    public final r590 c;
    public final fxu d;
    public final nsm0 e;
    public final boolean f;
    public final ArrayList g;
    public n3r h;
    public long i;
    public long t = -1;
    public boolean R0 = true;

    public gr51(String str, fxu fxuVar, r590 r590Var, nsm0 nsm0Var, m0u0 m0u0Var, boolean z) {
        this.a = m0u0Var;
        this.b = str;
        this.c = r590Var;
        this.d = fxuVar;
        this.e = nsm0Var;
        this.f = z;
        this.g = p7h.O(new yeg1[]{r590Var});
    }

    public final void a(yeg1 yeg1Var) {
        this.g.add(yeg1Var);
    }

    public final void close() throws IOException {
        Integer num;
        if (this.P0) {
            return;
        }
        this.P0 = true;
        n3r n3rVar = this.h;
        if (n3rVar == null) {
            u890.C("dataSpec");
            throw null;
        }
        n3rVar.toString();
        Thread.currentThread().getId();
        ByteArrayInputStream byteArrayInputStream = this.Z;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
        iq51 iq51Var = this.Y;
        if (iq51Var != null && (num = iq51Var.o) != null) {
            int iIntValue = num.intValue();
            fxu fxuVar = iq51Var.b;
            String str = iq51Var.c;
            ptu ptuVar = fxuVar.a;
            zmz zmzVarN = EsDownload.FinishSegmentDataRequestParams.n();
            knz knzVarO = EsDownload.SegmentFileStreamerId.o();
            knzVarO.n(iIntValue);
            zmzVarN.n(knzVarO.build());
            zmzVarN.q(str);
            ptuVar.callSingle("spotify.download.esperanto.proto.Download", "FinishSegmentDataRequest", zmzVarN.build()).map(rzs0.a1).subscribe(fcc.e1, dxu.b, fxuVar.d);
        }
        if (this.Q0) {
            for (yeg1 yeg1Var : this.g) {
                n3r n3rVar2 = this.h;
                if (n3rVar2 == null) {
                    u890.C("dataSpec");
                    throw null;
                }
                yeg1Var.e(this, n3rVar2, this.R0);
            }
        }
    }

    public final Uri getUri() {
        n3r n3rVar = this.h;
        if (n3rVar != null) {
            return n3rVar.a;
        }
        u890.C("dataSpec");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        iq51 iq51Var;
        long j;
        Long l;
        long jLongValue;
        int i4;
        h520 h520Var;
        h520 h520Var2;
        rb01 rb01Var;
        int i5;
        int i6;
        rb01 rb01Var2;
        rb01 rb01Var3;
        ByteArrayInputStream byteArrayInputStream = this.Z;
        ArrayList<yeg1> arrayList = this.g;
        if (byteArrayInputStream != null) {
            if (i2 == 0) {
                rb01Var3 = new rb01(0, 0, 0, false);
            } else {
                long jMin = i2;
                long j2 = this.t;
                if (j2 != -1) {
                    long j3 = j2 - this.X;
                    if (j3 == 0) {
                        rb01Var3 = new rb01(-1, 0, 0, false);
                    } else {
                        jMin = Math.min(jMin, j3);
                        i6 = byteArrayInputStream.read(bArr, i, (int) jMin);
                        rb01Var2 = new rb01(i6, 0, i6, false);
                        if (i6 == -1) {
                            rb01Var3 = new rb01(-1, 0, 0, false);
                        } else {
                            this.X += (long) i6;
                            rb01Var3 = rb01Var2;
                        }
                    }
                } else {
                    i6 = byteArrayInputStream.read(bArr, i, (int) jMin);
                    rb01Var2 = new rb01(i6, 0, i6, false);
                    if (i6 == -1) {
                        rb01Var3 = new rb01(-1, 0, 0, false);
                    } else {
                        this.X += (long) i6;
                        rb01Var3 = rb01Var2;
                    }
                }
            }
            int i7 = rb01Var3.a;
            if (i7 != -1) {
                for (yeg1 yeg1Var : arrayList) {
                    n3r n3rVar = this.h;
                    if (n3rVar == null) {
                        u890.C("dataSpec");
                        throw null;
                    }
                    yeg1Var.m(this, n3rVar, this.R0, rb01Var3.c);
                }
                return i7;
            }
        } else {
            if (i2 == 0) {
                rb01Var = new rb01(0, 0, 0, false);
            } else {
                long jMin2 = i2;
                long j4 = this.t;
                if (j4 != -1) {
                    long j5 = j4 - this.X;
                    if (j5 == 0) {
                        rb01Var = new rb01(-1, 0, 0, false);
                    } else {
                        jMin2 = Math.min(jMin2, j5);
                        i3 = (int) jMin2;
                        iq51Var = this.Y;
                        iq51Var.getClass();
                        j = iq51Var.i;
                        l = iq51Var.m;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = Long.MAX_VALUE;
                        }
                        if (j >= jLongValue) {
                            rb01Var = new rb01(-1, 0, 0, iq51Var.n);
                        } else {
                            if (iq51Var.k == null) {
                                iq51Var.a();
                            }
                            h520 h520Var3 = iq51Var.k;
                            h520Var3.getClass();
                            i4 = h520Var3.a.e;
                            h520Var = iq51Var.k;
                            if (i4 == 1) {
                                h520Var.getClass();
                                k220.i("File streamer error: ".concat(eqq.x(h520Var.a.e)));
                                return 0;
                            }
                            h520Var.getClass();
                            int i8 = h520Var.b.read(bArr, i, i3);
                            int iMin = Math.min(iq51Var.l, i8);
                            iq51Var.l -= iMin;
                            iq51Var.i += (long) i8;
                            h520Var2 = iq51Var.k;
                            h520Var2.getClass();
                            if (h520Var2.b.available() == 0) {
                                iq51Var.k = null;
                            }
                            rb01Var = new rb01(i8, i8 - iMin, iMin, iq51Var.n);
                        }
                        i5 = rb01Var.a;
                        if (i5 == -1) {
                            rb01Var = new rb01(-1, 0, 0, false);
                        } else {
                            this.X += (long) i5;
                        }
                    }
                } else {
                    i3 = (int) jMin2;
                    iq51Var = this.Y;
                    iq51Var.getClass();
                    j = iq51Var.i;
                    l = iq51Var.m;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                    if (j >= jLongValue) {
                        rb01Var = new rb01(-1, 0, 0, iq51Var.n);
                    } else {
                        if (iq51Var.k == null) {
                            iq51Var.a();
                        }
                        h520 h520Var4 = iq51Var.k;
                        h520Var4.getClass();
                        i4 = h520Var4.a.e;
                        h520Var = iq51Var.k;
                        if (i4 == 1) {
                            h520Var.getClass();
                            k220.i("File streamer error: ".concat(eqq.x(h520Var.a.e)));
                            return 0;
                        }
                        h520Var.getClass();
                        int i9 = h520Var.b.read(bArr, i, i3);
                        int iMin2 = Math.min(iq51Var.l, i9);
                        iq51Var.l -= iMin2;
                        iq51Var.i += (long) i9;
                        h520Var2 = iq51Var.k;
                        h520Var2.getClass();
                        if (h520Var2.b.available() == 0) {
                            iq51Var.k = null;
                        }
                        rb01Var = new rb01(i9, i9 - iMin2, iMin2, iq51Var.n);
                    }
                    i5 = rb01Var.a;
                    if (i5 == -1) {
                        rb01Var = new rb01(-1, 0, 0, false);
                    } else {
                        this.X += (long) i5;
                    }
                }
            }
            int i10 = rb01Var.a;
            if (i10 != -1) {
                int i11 = rb01Var.b;
                if (i11 > 0) {
                    for (yeg1 yeg1Var2 : arrayList) {
                        n3r n3rVar2 = this.h;
                        if (n3rVar2 == null) {
                            u890.C("dataSpec");
                            throw null;
                        }
                        yeg1Var2.m(this, n3rVar2, false, i11);
                    }
                }
                int i12 = rb01Var.c;
                if (i12 > 0) {
                    for (yeg1 yeg1Var3 : arrayList) {
                        n3r n3rVar3 = this.h;
                        if (n3rVar3 == null) {
                            u890.C("dataSpec");
                            throw null;
                        }
                        yeg1Var3.m(this, n3rVar3, true, i12);
                    }
                }
                if (rb01Var.d && !this.N0) {
                    this.c.z0();
                    this.N0 = true;
                }
                return i10;
            }
        }
        return -1;
    }

    public final long t(n3r n3rVar) {
        Long l;
        Boolean bool;
        m0u0 m0u0Var = this.a;
        String str = m0u0Var.d;
        this.h = n3rVar;
        this.i = n3rVar.f;
        this.X = 0L;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = true;
        iq51 iq51Var = null;
        this.S0 = null;
        Object obj = n3rVar.j;
        boolean z = obj instanceof zhg0;
        ArrayList<yeg1> arrayList = this.g;
        boolean z2 = this.f;
        fxu fxuVar = this.d;
        if (z) {
            byte[] bArr = (byte[]) fxuVar.b(this.b, zod.D(m0u0Var), str, 1, new mn41(this, (byte) 20)).blockingGet();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            long j = this.i;
            if (j > 0) {
                byteArrayInputStream.skip(j);
            }
            this.Z = byteArrayInputStream;
            this.R0 = !z2;
            for (yeg1 yeg1Var : arrayList) {
                n3r n3rVar2 = this.h;
                if (n3rVar2 == null) {
                    u890.C("dataSpec");
                    throw null;
                }
                yeg1Var.j(this, n3rVar2, this.R0);
            }
            this.Q0 = true;
            long length = bArr.length;
            this.t = length;
            return length;
        }
        this.O0 = (gq51) this.e.invoke(str, new rl21(this, ((np51) obj).a(), (byte) 24));
        n3rVar.toString();
        Thread.currentThread().getId();
        np51 np51Var = (np51) obj;
        String str2 = np51Var.b;
        List list = np51Var.a;
        if (z2) {
            try {
                bool = (Boolean) fxuVar.e(str2, np51Var.a()).blockingGet();
            } catch (Exception e) {
                Logger.l(e, "Failed cache check for segment, defaulting to network transfer", new Object[0]);
                bool = Boolean.FALSE;
            }
            bool.getClass();
            this.R0 = !bool.booleanValue();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yeg1) it.next()).t(this, n3rVar, this.R0);
        }
        gq51 gq51Var = this.O0;
        if (gq51Var != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new URL((String) it2.next()));
            }
            iq51Var = new iq51(gq51Var.a, gq51Var.b, str2, (URL[]) arrayList2.toArray(new URL[0]), gq51Var.g, this.i, new ggx0(0, gq51Var, gq51.class, "getId", "getId()Lio/reactivex/rxjava3/core/Single;", 0, (byte) 23), gq51Var.k, gq51Var.h);
        }
        this.Y = iq51Var;
        this.t = (iq51Var == null || (l = iq51Var.m) == null) ? -1L : l.longValue();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((yeg1) it3.next()).j(this, n3rVar, this.R0);
        }
        this.Q0 = true;
        return this.t;
    }
}
