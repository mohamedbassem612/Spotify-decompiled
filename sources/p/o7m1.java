package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o7m1 {
    public final String a;
    public final koc0 b;
    public final iyc0 c;
    public final nfa0 d;
    public final q8n e;
    public final kt91 f;
    public final bpb1 g;
    public final xe01 h;
    public final xgn0 i;
    public llm j;

    public o7m1(String str, koc0 koc0Var, iyc0 iyc0Var, nfa0 nfa0Var, q8n q8nVar, kt91 kt91Var) {
        this.a = str;
        this.b = koc0Var;
        this.c = iyc0Var;
        this.d = nfa0Var;
        this.e = q8nVar;
        this.f = kt91Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.g = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
        this.i = ygn0.a();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:136:0x028c  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:164:0x031e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0323  */
    /* JADX WARN: Code duplicated, block: B:176:0x0342  */
    /* JADX WARN: Code duplicated, block: B:218:0x0402 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0404 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x00f2, blocks: (B:165:0x031f, B:169:0x0326, B:177:0x0343, B:219:0x0404, B:146:0x02c7, B:159:0x02fa, B:161:0x030f, B:38:0x00e0, B:114:0x0236, B:137:0x0296, B:139:0x029a, B:141:0x02b9, B:47:0x011f, B:70:0x0177, B:71:0x0180, B:73:0x0186, B:83:0x01b8, B:85:0x01bd, B:88:0x01c7, B:89:0x01ce, B:91:0x01d4, B:93:0x01da, B:100:0x01f1, B:101:0x01f4, B:104:0x0200, B:105:0x0202, B:107:0x0217, B:109:0x0226, B:57:0x0154, B:59:0x0157, B:61:0x015f, B:63:0x0164, B:65:0x0169, B:66:0x016b), top: B:300:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x0407  */
    /* JADX WARN: Code duplicated, block: B:225:0x040e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0410  */
    /* JADX WARN: Code duplicated, block: B:229:0x0416  */
    /* JADX WARN: Code duplicated, block: B:241:0x0450  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x04aa A[Catch: all -> 0x0487, TRY_ENTER, TryCatch #48 {all -> 0x0487, blocks: (B:246:0x0478, B:260:0x04aa, B:262:0x04ae, B:269:0x04ba), top: B:300:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:265:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:267:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:268:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:274:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:276:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:284:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x029a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0198 A[LOOP:0: B:71:0x0180->B:76:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bd A[Catch: all -> 0x00f2, Exception -> 0x019b, CancellationException -> 0x01a5, TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x00f2, blocks: (B:165:0x031f, B:169:0x0326, B:177:0x0343, B:219:0x0404, B:146:0x02c7, B:159:0x02fa, B:161:0x030f, B:38:0x00e0, B:114:0x0236, B:137:0x0296, B:139:0x029a, B:141:0x02b9, B:47:0x011f, B:70:0x0177, B:71:0x0180, B:73:0x0186, B:83:0x01b8, B:85:0x01bd, B:88:0x01c7, B:89:0x01ce, B:91:0x01d4, B:93:0x01da, B:100:0x01f1, B:101:0x01f4, B:104:0x0200, B:105:0x0202, B:107:0x0217, B:109:0x0226, B:57:0x0154, B:59:0x0157, B:61:0x015f, B:63:0x0164, B:65:0x0169, B:66:0x016b), top: B:300:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c7 A[Catch: all -> 0x00f2, CancellationException -> 0x039e, Exception -> 0x03ad, TRY_ENTER, TryCatch #32 {Exception -> 0x03ad, blocks: (B:70:0x0177, B:71:0x0180, B:83:0x01b8, B:88:0x01c7, B:89:0x01ce), top: B:303:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e2 A[LOOP:1: B:89:0x01ce->B:96:0x01e2, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, onm onmVar) throws Throwable {
        m7m1 m7m1Var;
        iyc0 iyc0Var;
        String str2;
        int i;
        int i2;
        CancellationException cancellationException;
        l811 l811Var;
        jb20 jb20Var;
        int i3;
        int i4;
        d9n d9nVar;
        int i5;
        int i6;
        d9n d9nVar2;
        int i7;
        jb20 jb20Var2;
        List list;
        Iterator it;
        iyc0 iyc0Var2;
        Object next;
        jb20 jb20Var3;
        Iterator it2;
        Object next2;
        jb20 jb20Var4;
        jb20 jb20Var5;
        int i8;
        m7m1 m7m1Var2;
        l811 l811Var2;
        int i9;
        m7m1 m7m1Var3;
        jb20 jb20Var6;
        l811 l811Var3;
        jb20 jb20Var7;
        int i10;
        boolean z;
        iyc0 iyc0Var3;
        String str3;
        boolean z2;
        d9n d9nVar3;
        boolean z3;
        iyc0 iyc0Var4;
        boolean z4;
        iyc0 iyc0Var5;
        CancellationException cancellationException2;
        int i11;
        xgn0 xgn0Var = "Invalid resource ID provided: %s";
        Integer num = 2131963935;
        if (onmVar instanceof m7m1) {
            m7m1Var = (m7m1) onmVar;
            int i12 = m7m1Var.t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                m7m1Var.t = i12 - Integer.MIN_VALUE;
            } else {
                m7m1Var = new m7m1(this, onmVar);
            }
        } else {
            m7m1Var = new m7m1(this, onmVar);
        }
        Object objB = m7m1Var.h;
        int i13 = m7m1Var.t;
        String str4 = this.a;
        iyc0 iyc0Var6 = this.c;
        xgn0Var = this.i;
        m7m1 m7m1Var4 = this.g;
        iyc0 iyc0Var7 = null;
        d9n d9nVar4 = d9n.a;
        try {
            try {
                try {
                    switch (i13) {
                        case 0:
                            hm5.M(objB);
                            if (!xgn0Var.g()) {
                                return Boolean.TRUE;
                            }
                            l811 l811Var4 = new l811();
                            try {
                                try {
                                    try {
                                        m7m1Var4.m((Object) null, new l7m1(null));
                                        str2 = str;
                                        try {
                                            m7m1Var.a = str2;
                                            m7m1Var.b = l811Var4;
                                            try {
                                                m7m1Var.f = 0;
                                                m7m1Var.g = 0;
                                                try {
                                                    m7m1Var.t = 1;
                                                    objB = b(m7m1Var);
                                                    if (objB == d9nVar4) {
                                                        return d9nVar4;
                                                    }
                                                    l811Var = l811Var4;
                                                    i4 = 0;
                                                    i3 = 0;
                                                    try {
                                                        try {
                                                            list = (List) objB;
                                                            it = list.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    try {
                                                                        try {
                                                                            next = it.next();
                                                                            iyc0Var2 = iyc0Var6;
                                                                            if (u890.j(((jb20) next).a, str2)) {
                                                                                iyc0Var6 = iyc0Var2;
                                                                            }
                                                                        } catch (Exception unused) {
                                                                            d9nVar = d9nVar4;
                                                                            num = num;
                                                                            jb20Var2 = null;
                                                                            i5 = 1;
                                                                            i6 = 0;
                                                                            if (i4 == 0) {
                                                                                if (jb20Var2 != null) {
                                                                                    str3 = jb20Var2.a;
                                                                                } else {
                                                                                    str3 = null;
                                                                                }
                                                                                try {
                                                                                    z2 = l811Var.a;
                                                                                    d9nVar3 = d9nVar;
                                                                                    if (i3 != 0) {
                                                                                        z3 = i5;
                                                                                    } else {
                                                                                        z3 = i6;
                                                                                    }
                                                                                    if (!z2) {
                                                                                        str3 = null;
                                                                                    }
                                                                                    try {
                                                                                        m7m1Var.a = null;
                                                                                        m7m1Var.b = null;
                                                                                        m7m1Var.c = null;
                                                                                        m7m1Var.d = null;
                                                                                        m7m1Var.e = null;
                                                                                        m7m1Var.f = i3;
                                                                                        m7m1Var.g = i4;
                                                                                        m7m1Var.t = 6;
                                                                                        iyc0Var3 = null;
                                                                                        z = i5;
                                                                                        try {
                                                                                            if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                return d9nVar3;
                                                                                            }
                                                                                        } catch (Throwable th) {
                                                                                            th = th;
                                                                                            xgn0Var = xgn0Var;
                                                                                            m7m1Var4 = m7m1Var4;
                                                                                            iyc0Var = iyc0Var3;
                                                                                            m7m1Var4.l(iyc0Var);
                                                                                            xgn0Var.c(iyc0Var);
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        iyc0Var3 = null;
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    iyc0Var3 = null;
                                                                                }
                                                                            } else {
                                                                                z = i5;
                                                                                iyc0Var3 = null;
                                                                            }
                                                                            kt91 kt91Var = this.f;
                                                                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                            try {
                                                                                iyc0 iyc0Var8 = iyc0Var3;
                                                                                kt91Var.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                Boolean bool = Boolean.FALSE;
                                                                                m7m1Var4.l(iyc0Var8);
                                                                                xgn0Var.c(iyc0Var8);
                                                                                return bool;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                xgn0Var = xgn0Var;
                                                                                m7m1Var = m7m1Var4;
                                                                                iyc0Var6 = iyc0Var3;
                                                                                m7m1Var4 = m7m1Var;
                                                                                iyc0Var = iyc0Var6;
                                                                                m7m1Var4.l(iyc0Var);
                                                                                xgn0Var.c(iyc0Var);
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (CancellationException e) {
                                                                        d9nVar4 = d9nVar4;
                                                                        iyc0Var7 = null;
                                                                        i = 1;
                                                                        i2 = 0;
                                                                        cancellationException = e;
                                                                        i4 = i4;
                                                                        i3 = i3;
                                                                        m7m1Var4 = m7m1Var4;
                                                                        jb20Var = null;
                                                                        if (i4 != 0) {
                                                                            iyc0Var = iyc0Var7;
                                                                            throw cancellationException;
                                                                        }
                                                                        if (jb20Var != null) {
                                                                            iyc0Var4 = jb20Var.a;
                                                                        } else {
                                                                            iyc0Var4 = iyc0Var7;
                                                                        }
                                                                        z4 = l811Var.a;
                                                                        if (i3 == 0) {
                                                                            i = i2;
                                                                        }
                                                                        if (z4) {
                                                                            iyc0Var5 = iyc0Var4;
                                                                        } else {
                                                                            iyc0Var5 = iyc0Var7;
                                                                        }
                                                                        m7m1Var.a = iyc0Var7;
                                                                        m7m1Var.b = iyc0Var7;
                                                                        m7m1Var.c = iyc0Var7;
                                                                        m7m1Var.d = cancellationException;
                                                                        m7m1Var.e = iyc0Var7;
                                                                        m7m1Var.f = i3;
                                                                        m7m1Var.g = i4;
                                                                        m7m1Var.t = 5;
                                                                        iyc0Var = iyc0Var7;
                                                                        try {
                                                                            if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                return d9nVar4;
                                                                            }
                                                                            cancellationException2 = cancellationException;
                                                                            throw cancellationException2;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            m7m1Var4.l(iyc0Var);
                                                                            xgn0Var.c(iyc0Var);
                                                                            throw th;
                                                                        }
                                                                        th = th5;
                                                                        m7m1Var4.l(iyc0Var);
                                                                        xgn0Var.c(iyc0Var);
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    iyc0Var2 = iyc0Var6;
                                                                    next = null;
                                                                }
                                                            }
                                                            jb20Var3 = (jb20) next;
                                                            if (jb20Var3 == null) {
                                                                Boolean bool2 = Boolean.TRUE;
                                                                m7m1Var4.l((Object) null);
                                                                xgn0Var.c((Object) null);
                                                                return bool2;
                                                            }
                                                            it2 = list.iterator();
                                                            while (true) {
                                                                if (it2.hasNext()) {
                                                                    try {
                                                                        next2 = it2.next();
                                                                        num = num;
                                                                        try {
                                                                            num = ((jb20) next2).c ? 2131963935 : num;
                                                                        } catch (Exception unused2) {
                                                                            d9nVar = d9nVar4;
                                                                            jb20Var2 = null;
                                                                            i5 = 1;
                                                                            i6 = 0;
                                                                            if (i4 == 0) {
                                                                                if (jb20Var2 != null) {
                                                                                    str3 = jb20Var2.a;
                                                                                } else {
                                                                                    str3 = null;
                                                                                }
                                                                                z2 = l811Var.a;
                                                                                d9nVar3 = d9nVar;
                                                                                if (i3 != 0) {
                                                                                    z3 = i5;
                                                                                } else {
                                                                                    z3 = i6;
                                                                                }
                                                                                if (!z2) {
                                                                                    str3 = null;
                                                                                }
                                                                                m7m1Var.a = null;
                                                                                m7m1Var.b = null;
                                                                                m7m1Var.c = null;
                                                                                m7m1Var.d = null;
                                                                                m7m1Var.e = null;
                                                                                m7m1Var.f = i3;
                                                                                m7m1Var.g = i4;
                                                                                m7m1Var.t = 6;
                                                                                iyc0Var3 = null;
                                                                                z = i5;
                                                                                if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                    return d9nVar3;
                                                                                }
                                                                            } else {
                                                                                z = i5;
                                                                                iyc0Var3 = null;
                                                                            }
                                                                            kt91 kt91Var2 = this.f;
                                                                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                            iyc0 iyc0Var9 = iyc0Var3;
                                                                            kt91Var2.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                            Boolean bool3 = Boolean.FALSE;
                                                                            m7m1Var4.l(iyc0Var9);
                                                                            xgn0Var.c(iyc0Var9);
                                                                            return bool3;
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                        num = num;
                                                                    }
                                                                } else {
                                                                    num = num;
                                                                    next2 = null;
                                                                }
                                                            }
                                                            try {
                                                                jb20Var4 = (jb20) next2;
                                                                try {
                                                                    m7m1Var4.m((Object) null, new l7m1(list));
                                                                    if (jb20Var4 != null) {
                                                                        m7m1Var = m7m1Var;
                                                                        d9nVar = d9nVar4;
                                                                        int i14 = i3;
                                                                        jb20Var5 = jb20Var3;
                                                                        i8 = i14;
                                                                        if (jb20Var5.c) {
                                                                            l811Var = l811Var;
                                                                            jb20Var2 = jb20Var4;
                                                                            gqj1 gqj1Var = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                                                            m7m1Var.a = str2;
                                                                            m7m1Var.b = jb20Var2;
                                                                            m7m1Var.c = l811Var;
                                                                            m7m1Var.d = null;
                                                                            m7m1Var.e = null;
                                                                            m7m1Var.f = i8;
                                                                            i5 = 1;
                                                                            m7m1Var.g = 1;
                                                                            m7m1Var.t = 4;
                                                                            objB = rc2.O(5000L, gqj1Var, m7m1Var);
                                                                            if (objB != d9nVar) {
                                                                                i4 = 1;
                                                                                if (((cxc0) objB) == null) {
                                                                                    i11 = 0;
                                                                                    Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                                                                } else {
                                                                                    i11 = 0;
                                                                                }
                                                                                Boolean bool4 = Boolean.TRUE;
                                                                                m7m1Var4.l((Object) null);
                                                                                xgn0Var.c((Object) null);
                                                                                return bool4;
                                                                            }
                                                                        } else {
                                                                            String str5 = jb20Var5.a;
                                                                            m7m1Var.a = str2;
                                                                            m7m1Var.b = jb20Var4;
                                                                            m7m1Var.c = l811Var;
                                                                            m7m1Var.d = null;
                                                                            m7m1Var.e = jb20Var5;
                                                                            m7m1Var.f = 1;
                                                                            m7m1Var.g = i4;
                                                                            m7m1Var.t = 3;
                                                                            m7m1Var3 = m7m1Var;
                                                                            objB = ((xyc0) iyc0Var2).p(str4, str5, true, false, m7m1Var3);
                                                                            m7m1Var = m7m1Var3;
                                                                            if (objB != d9nVar) {
                                                                                jb20Var6 = jb20Var5;
                                                                                l811Var3 = l811Var;
                                                                                jb20Var7 = jb20Var4;
                                                                                i8 = 1;
                                                                                ((py21) objB).d();
                                                                                jb20Var5 = jb20Var6;
                                                                                l811Var = l811Var3;
                                                                                jb20Var2 = jb20Var7;
                                                                                gqj1 gqj1Var2 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                                                                m7m1Var.a = str2;
                                                                                m7m1Var.b = jb20Var2;
                                                                                m7m1Var.c = l811Var;
                                                                                m7m1Var.d = null;
                                                                                m7m1Var.e = null;
                                                                                m7m1Var.f = i8;
                                                                                i5 = 1;
                                                                                m7m1Var.g = 1;
                                                                                m7m1Var.t = 4;
                                                                                objB = rc2.O(5000L, gqj1Var2, m7m1Var);
                                                                                if (objB != d9nVar) {
                                                                                    i4 = 1;
                                                                                    if (((cxc0) objB) == null) {
                                                                                        i11 = 0;
                                                                                        Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                                                                    } else {
                                                                                        i11 = 0;
                                                                                    }
                                                                                    Boolean bool5 = Boolean.TRUE;
                                                                                    m7m1Var4.l((Object) null);
                                                                                    xgn0Var.c((Object) null);
                                                                                    return bool5;
                                                                                }
                                                                            }
                                                                        }
                                                                        return d9nVar;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            l811Var.a = true;
                                                                            try {
                                                                                String str6 = jb20Var4.a;
                                                                                m7m1Var.a = str2;
                                                                                m7m1Var.b = jb20Var4;
                                                                                m7m1Var.c = l811Var;
                                                                                m7m1Var.d = null;
                                                                                m7m1Var.e = jb20Var3;
                                                                                m7m1Var.f = i3;
                                                                                m7m1Var.g = i4;
                                                                                m7m1Var.t = 2;
                                                                                try {
                                                                                    m7m1Var2 = m7m1Var;
                                                                                    d9nVar = d9nVar4;
                                                                                    try {
                                                                                        objB = ((xyc0) iyc0Var2).p(str4, str6, false, false, m7m1Var2);
                                                                                        m7m1Var = m7m1Var2;
                                                                                        if (objB != d9nVar) {
                                                                                            int i15 = i3;
                                                                                            jb20Var5 = jb20Var3;
                                                                                            i8 = i15;
                                                                                            l811Var2 = l811Var;
                                                                                            jb20Var2 = jb20Var4;
                                                                                            try {
                                                                                                ((py21) objB).d();
                                                                                                jb20Var4 = jb20Var2;
                                                                                                l811Var = l811Var2;
                                                                                                try {
                                                                                                    if (jb20Var5.c) {
                                                                                                        try {
                                                                                                            String str7 = jb20Var5.a;
                                                                                                            m7m1Var.a = str2;
                                                                                                            m7m1Var.b = jb20Var4;
                                                                                                            m7m1Var.c = l811Var;
                                                                                                            m7m1Var.d = null;
                                                                                                            m7m1Var.e = jb20Var5;
                                                                                                            m7m1Var.f = 1;
                                                                                                            m7m1Var.g = i4;
                                                                                                            m7m1Var.t = 3;
                                                                                                            m7m1Var3 = m7m1Var;
                                                                                                            try {
                                                                                                                objB = ((xyc0) iyc0Var2).p(str4, str7, true, false, m7m1Var3);
                                                                                                                m7m1Var = m7m1Var3;
                                                                                                                if (objB != d9nVar) {
                                                                                                                    jb20Var6 = jb20Var5;
                                                                                                                    l811Var3 = l811Var;
                                                                                                                    jb20Var7 = jb20Var4;
                                                                                                                    i8 = 1;
                                                                                                                    try {
                                                                                                                        ((py21) objB).d();
                                                                                                                        jb20Var5 = jb20Var6;
                                                                                                                        l811Var = l811Var3;
                                                                                                                        jb20Var2 = jb20Var7;
                                                                                                                        try {
                                                                                                                            gqj1 gqj1Var3 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                                                                                                            m7m1Var.a = str2;
                                                                                                                            m7m1Var.b = jb20Var2;
                                                                                                                            m7m1Var.c = l811Var;
                                                                                                                            m7m1Var.d = null;
                                                                                                                            m7m1Var.e = null;
                                                                                                                            m7m1Var.f = i8;
                                                                                                                            i5 = 1;
                                                                                                                            try {
                                                                                                                                m7m1Var.g = 1;
                                                                                                                                m7m1Var.t = 4;
                                                                                                                                objB = rc2.O(5000L, gqj1Var3, m7m1Var);
                                                                                                                                if (objB != d9nVar) {
                                                                                                                                    i4 = 1;
                                                                                                                                    try {
                                                                                                                                        if (((cxc0) objB) == null) {
                                                                                                                                            i11 = 0;
                                                                                                                                            try {
                                                                                                                                                Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                                                                                                                            } catch (CancellationException e2) {
                                                                                                                                                e = e2;
                                                                                                                                                i4 = i4;
                                                                                                                                                i2 = i11;
                                                                                                                                                xgn0Var = xgn0Var;
                                                                                                                                                jb20Var = jb20Var2;
                                                                                                                                                i = i5;
                                                                                                                                                cancellationException = e;
                                                                                                                                                d9nVar4 = d9nVar;
                                                                                                                                                i3 = i8;
                                                                                                                                                m7m1Var4 = m7m1Var4;
                                                                                                                                                iyc0Var7 = null;
                                                                                                                                                if (i4 != 0) {
                                                                                                                                                    iyc0Var = iyc0Var7;
                                                                                                                                                    throw cancellationException;
                                                                                                                                                }
                                                                                                                                                if (jb20Var != null) {
                                                                                                                                                    iyc0Var4 = jb20Var.a;
                                                                                                                                                } else {
                                                                                                                                                    iyc0Var4 = iyc0Var7;
                                                                                                                                                }
                                                                                                                                                z4 = l811Var.a;
                                                                                                                                                if (i3 == 0) {
                                                                                                                                                    i = i2;
                                                                                                                                                }
                                                                                                                                                if (z4) {
                                                                                                                                                    iyc0Var5 = iyc0Var4;
                                                                                                                                                } else {
                                                                                                                                                    iyc0Var5 = iyc0Var7;
                                                                                                                                                }
                                                                                                                                                m7m1Var.a = iyc0Var7;
                                                                                                                                                m7m1Var.b = iyc0Var7;
                                                                                                                                                m7m1Var.c = iyc0Var7;
                                                                                                                                                m7m1Var.d = cancellationException;
                                                                                                                                                m7m1Var.e = iyc0Var7;
                                                                                                                                                m7m1Var.f = i3;
                                                                                                                                                m7m1Var.g = i4;
                                                                                                                                                m7m1Var.t = 5;
                                                                                                                                                iyc0Var = iyc0Var7;
                                                                                                                                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                                                                                    return d9nVar4;
                                                                                                                                                }
                                                                                                                                                cancellationException2 = cancellationException;
                                                                                                                                                throw cancellationException2;
                                                                                                                                                th = th5;
                                                                                                                                                m7m1Var4.l(iyc0Var);
                                                                                                                                                xgn0Var.c(iyc0Var);
                                                                                                                                                throw th;
                                                                                                                                            } catch (Exception unused4) {
                                                                                                                                                i6 = i11;
                                                                                                                                                i3 = i8;
                                                                                                                                                str2 = str2;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i11 = 0;
                                                                                                                                        }
                                                                                                                                        Boolean bool6 = Boolean.TRUE;
                                                                                                                                        m7m1Var4.l((Object) null);
                                                                                                                                        xgn0Var.c((Object) null);
                                                                                                                                        return bool6;
                                                                                                                                    } catch (CancellationException e3) {
                                                                                                                                        e = e3;
                                                                                                                                        i11 = 0;
                                                                                                                                    } catch (Exception unused5) {
                                                                                                                                        i3 = i8;
                                                                                                                                        str2 = str2;
                                                                                                                                        i6 = 0;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (CancellationException e4) {
                                                                                                                                e = e4;
                                                                                                                                i10 = 0;
                                                                                                                                i2 = i10;
                                                                                                                                xgn0Var = xgn0Var;
                                                                                                                                jb20Var = jb20Var2;
                                                                                                                                i4 = i5;
                                                                                                                                i = i4;
                                                                                                                                cancellationException = e;
                                                                                                                                d9nVar4 = d9nVar;
                                                                                                                                i3 = i8;
                                                                                                                                m7m1Var4 = m7m1Var4;
                                                                                                                                iyc0Var7 = null;
                                                                                                                                if (i4 != 0) {
                                                                                                                                    iyc0Var = iyc0Var7;
                                                                                                                                    throw cancellationException;
                                                                                                                                }
                                                                                                                                if (jb20Var != null) {
                                                                                                                                    iyc0Var4 = jb20Var.a;
                                                                                                                                } else {
                                                                                                                                    iyc0Var4 = iyc0Var7;
                                                                                                                                }
                                                                                                                                z4 = l811Var.a;
                                                                                                                                if (i3 == 0) {
                                                                                                                                    i = i2;
                                                                                                                                }
                                                                                                                                if (z4) {
                                                                                                                                    iyc0Var5 = iyc0Var4;
                                                                                                                                } else {
                                                                                                                                    iyc0Var5 = iyc0Var7;
                                                                                                                                }
                                                                                                                                m7m1Var.a = iyc0Var7;
                                                                                                                                m7m1Var.b = iyc0Var7;
                                                                                                                                m7m1Var.c = iyc0Var7;
                                                                                                                                m7m1Var.d = cancellationException;
                                                                                                                                m7m1Var.e = iyc0Var7;
                                                                                                                                m7m1Var.f = i3;
                                                                                                                                m7m1Var.g = i4;
                                                                                                                                m7m1Var.t = 5;
                                                                                                                                iyc0Var = iyc0Var7;
                                                                                                                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                                                                    return d9nVar4;
                                                                                                                                }
                                                                                                                                cancellationException2 = cancellationException;
                                                                                                                                throw cancellationException2;
                                                                                                                                th = th5;
                                                                                                                                m7m1Var4.l(iyc0Var);
                                                                                                                                xgn0Var.c(iyc0Var);
                                                                                                                                throw th;
                                                                                                                            } catch (Exception unused6) {
                                                                                                                                i3 = i8;
                                                                                                                                str2 = str2;
                                                                                                                                i4 = i5;
                                                                                                                                i6 = 0;
                                                                                                                                if (i4 == 0) {
                                                                                                                                    if (jb20Var2 != null) {
                                                                                                                                        str3 = jb20Var2.a;
                                                                                                                                    } else {
                                                                                                                                        str3 = null;
                                                                                                                                    }
                                                                                                                                    z2 = l811Var.a;
                                                                                                                                    d9nVar3 = d9nVar;
                                                                                                                                    if (i3 != 0) {
                                                                                                                                        z3 = i5;
                                                                                                                                    } else {
                                                                                                                                        z3 = i6;
                                                                                                                                    }
                                                                                                                                    if (!z2) {
                                                                                                                                        str3 = null;
                                                                                                                                    }
                                                                                                                                    m7m1Var.a = null;
                                                                                                                                    m7m1Var.b = null;
                                                                                                                                    m7m1Var.c = null;
                                                                                                                                    m7m1Var.d = null;
                                                                                                                                    m7m1Var.e = null;
                                                                                                                                    m7m1Var.f = i3;
                                                                                                                                    m7m1Var.g = i4;
                                                                                                                                    m7m1Var.t = 6;
                                                                                                                                    iyc0Var3 = null;
                                                                                                                                    z = i5;
                                                                                                                                    if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                                                        return d9nVar3;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    z = i5;
                                                                                                                                    iyc0Var3 = null;
                                                                                                                                }
                                                                                                                                kt91 kt91Var3 = this.f;
                                                                                                                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                                                                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                                                                                iyc0 iyc0Var10 = iyc0Var3;
                                                                                                                                kt91Var3.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                                                                Boolean bool7 = Boolean.FALSE;
                                                                                                                                m7m1Var4.l(iyc0Var10);
                                                                                                                                xgn0Var.c(iyc0Var10);
                                                                                                                                return bool7;
                                                                                                                            }
                                                                                                                        } catch (CancellationException e5) {
                                                                                                                            e = e5;
                                                                                                                            i10 = 0;
                                                                                                                            i5 = 1;
                                                                                                                        } catch (Exception unused7) {
                                                                                                                            i5 = 1;
                                                                                                                        }
                                                                                                                    } catch (CancellationException e6) {
                                                                                                                        e = e6;
                                                                                                                        i4 = i4;
                                                                                                                        l811Var = l811Var3;
                                                                                                                        jb20Var = jb20Var7;
                                                                                                                        i = 1;
                                                                                                                        i2 = 0;
                                                                                                                        cancellationException = e;
                                                                                                                        d9nVar4 = d9nVar;
                                                                                                                        i3 = i8;
                                                                                                                        m7m1Var4 = m7m1Var4;
                                                                                                                        iyc0Var7 = null;
                                                                                                                        if (i4 != 0) {
                                                                                                                            iyc0Var = iyc0Var7;
                                                                                                                            throw cancellationException;
                                                                                                                        }
                                                                                                                        if (jb20Var != null) {
                                                                                                                            iyc0Var4 = jb20Var.a;
                                                                                                                        } else {
                                                                                                                            iyc0Var4 = iyc0Var7;
                                                                                                                        }
                                                                                                                        z4 = l811Var.a;
                                                                                                                        if (i3 == 0) {
                                                                                                                            i = i2;
                                                                                                                        }
                                                                                                                        if (z4) {
                                                                                                                            iyc0Var5 = iyc0Var4;
                                                                                                                        } else {
                                                                                                                            iyc0Var5 = iyc0Var7;
                                                                                                                        }
                                                                                                                        m7m1Var.a = iyc0Var7;
                                                                                                                        m7m1Var.b = iyc0Var7;
                                                                                                                        m7m1Var.c = iyc0Var7;
                                                                                                                        m7m1Var.d = cancellationException;
                                                                                                                        m7m1Var.e = iyc0Var7;
                                                                                                                        m7m1Var.f = i3;
                                                                                                                        m7m1Var.g = i4;
                                                                                                                        m7m1Var.t = 5;
                                                                                                                        iyc0Var = iyc0Var7;
                                                                                                                        if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                                                            return d9nVar4;
                                                                                                                        }
                                                                                                                        cancellationException2 = cancellationException;
                                                                                                                        throw cancellationException2;
                                                                                                                        th = th5;
                                                                                                                        m7m1Var4.l(iyc0Var);
                                                                                                                        xgn0Var.c(iyc0Var);
                                                                                                                        throw th;
                                                                                                                    } catch (Exception unused8) {
                                                                                                                        i3 = i8;
                                                                                                                        str2 = str2;
                                                                                                                        l811Var = l811Var3;
                                                                                                                        jb20Var2 = jb20Var7;
                                                                                                                        i5 = 1;
                                                                                                                        i6 = 0;
                                                                                                                        if (i4 == 0) {
                                                                                                                            if (jb20Var2 != null) {
                                                                                                                                str3 = jb20Var2.a;
                                                                                                                            } else {
                                                                                                                                str3 = null;
                                                                                                                            }
                                                                                                                            z2 = l811Var.a;
                                                                                                                            d9nVar3 = d9nVar;
                                                                                                                            if (i3 != 0) {
                                                                                                                                z3 = i5;
                                                                                                                            } else {
                                                                                                                                z3 = i6;
                                                                                                                            }
                                                                                                                            if (!z2) {
                                                                                                                                str3 = null;
                                                                                                                            }
                                                                                                                            m7m1Var.a = null;
                                                                                                                            m7m1Var.b = null;
                                                                                                                            m7m1Var.c = null;
                                                                                                                            m7m1Var.d = null;
                                                                                                                            m7m1Var.e = null;
                                                                                                                            m7m1Var.f = i3;
                                                                                                                            m7m1Var.g = i4;
                                                                                                                            m7m1Var.t = 6;
                                                                                                                            iyc0Var3 = null;
                                                                                                                            z = i5;
                                                                                                                            if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                                                return d9nVar3;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            z = i5;
                                                                                                                            iyc0Var3 = null;
                                                                                                                        }
                                                                                                                        kt91 kt91Var4 = this.f;
                                                                                                                        n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                                                                        n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                                                                        iyc0 iyc0Var11 = iyc0Var3;
                                                                                                                        kt91Var4.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                                                        Boolean bool8 = Boolean.FALSE;
                                                                                                                        m7m1Var4.l(iyc0Var11);
                                                                                                                        xgn0Var.c(iyc0Var11);
                                                                                                                        return bool8;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (CancellationException e7) {
                                                                                                                e = e7;
                                                                                                                m7m1Var = m7m1Var3;
                                                                                                                d9nVar4 = d9nVar;
                                                                                                                xgn0Var = xgn0Var;
                                                                                                                m7m1Var4 = m7m1Var4;
                                                                                                                l811Var = l811Var;
                                                                                                                jb20Var = jb20Var4;
                                                                                                                iyc0Var7 = null;
                                                                                                                i = 1;
                                                                                                                i2 = 0;
                                                                                                                cancellationException = e;
                                                                                                                i4 = i4;
                                                                                                                i3 = 1;
                                                                                                                if (i4 != 0) {
                                                                                                                    iyc0Var = iyc0Var7;
                                                                                                                    throw cancellationException;
                                                                                                                }
                                                                                                                if (jb20Var != null) {
                                                                                                                    iyc0Var4 = jb20Var.a;
                                                                                                                } else {
                                                                                                                    iyc0Var4 = iyc0Var7;
                                                                                                                }
                                                                                                                z4 = l811Var.a;
                                                                                                                if (i3 == 0) {
                                                                                                                    i = i2;
                                                                                                                }
                                                                                                                if (z4) {
                                                                                                                    iyc0Var5 = iyc0Var4;
                                                                                                                } else {
                                                                                                                    iyc0Var5 = iyc0Var7;
                                                                                                                }
                                                                                                                m7m1Var.a = iyc0Var7;
                                                                                                                m7m1Var.b = iyc0Var7;
                                                                                                                m7m1Var.c = iyc0Var7;
                                                                                                                m7m1Var.d = cancellationException;
                                                                                                                m7m1Var.e = iyc0Var7;
                                                                                                                m7m1Var.f = i3;
                                                                                                                m7m1Var.g = i4;
                                                                                                                m7m1Var.t = 5;
                                                                                                                iyc0Var = iyc0Var7;
                                                                                                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                                                    return d9nVar4;
                                                                                                                }
                                                                                                                cancellationException2 = cancellationException;
                                                                                                                throw cancellationException2;
                                                                                                                th = th5;
                                                                                                                m7m1Var4.l(iyc0Var);
                                                                                                                xgn0Var.c(iyc0Var);
                                                                                                                throw th;
                                                                                                            } catch (Exception unused9) {
                                                                                                                m7m1Var = m7m1Var3;
                                                                                                                str2 = str2;
                                                                                                                l811Var = l811Var;
                                                                                                                jb20Var2 = jb20Var4;
                                                                                                                i3 = 1;
                                                                                                                i5 = 1;
                                                                                                                i6 = 0;
                                                                                                                if (i4 == 0) {
                                                                                                                    if (jb20Var2 != null) {
                                                                                                                        str3 = jb20Var2.a;
                                                                                                                    } else {
                                                                                                                        str3 = null;
                                                                                                                    }
                                                                                                                    z2 = l811Var.a;
                                                                                                                    d9nVar3 = d9nVar;
                                                                                                                    if (i3 != 0) {
                                                                                                                        z3 = i5;
                                                                                                                    } else {
                                                                                                                        z3 = i6;
                                                                                                                    }
                                                                                                                    if (!z2) {
                                                                                                                        str3 = null;
                                                                                                                    }
                                                                                                                    m7m1Var.a = null;
                                                                                                                    m7m1Var.b = null;
                                                                                                                    m7m1Var.c = null;
                                                                                                                    m7m1Var.d = null;
                                                                                                                    m7m1Var.e = null;
                                                                                                                    m7m1Var.f = i3;
                                                                                                                    m7m1Var.g = i4;
                                                                                                                    m7m1Var.t = 6;
                                                                                                                    iyc0Var3 = null;
                                                                                                                    z = i5;
                                                                                                                    if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                                        return d9nVar3;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    z = i5;
                                                                                                                    iyc0Var3 = null;
                                                                                                                }
                                                                                                                kt91 kt91Var5 = this.f;
                                                                                                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                                                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                                                                iyc0 iyc0Var12 = iyc0Var3;
                                                                                                                kt91Var5.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                                                Boolean bool9 = Boolean.FALSE;
                                                                                                                m7m1Var4.l(iyc0Var12);
                                                                                                                xgn0Var.c(iyc0Var12);
                                                                                                                return bool9;
                                                                                                            }
                                                                                                        } catch (CancellationException e8) {
                                                                                                            e = e8;
                                                                                                        } catch (Exception unused10) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        l811Var = l811Var;
                                                                                                        jb20Var2 = jb20Var4;
                                                                                                        gqj1 gqj1Var4 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                                                                                        m7m1Var.a = str2;
                                                                                                        m7m1Var.b = jb20Var2;
                                                                                                        m7m1Var.c = l811Var;
                                                                                                        m7m1Var.d = null;
                                                                                                        m7m1Var.e = null;
                                                                                                        m7m1Var.f = i8;
                                                                                                        i5 = 1;
                                                                                                        m7m1Var.g = 1;
                                                                                                        m7m1Var.t = 4;
                                                                                                        objB = rc2.O(5000L, gqj1Var4, m7m1Var);
                                                                                                        if (objB != d9nVar) {
                                                                                                            i4 = 1;
                                                                                                            if (((cxc0) objB) == null) {
                                                                                                                i11 = 0;
                                                                                                                Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                                                                                            } else {
                                                                                                                i11 = 0;
                                                                                                            }
                                                                                                            Boolean bool10 = Boolean.TRUE;
                                                                                                            m7m1Var4.l((Object) null);
                                                                                                            xgn0Var.c((Object) null);
                                                                                                            return bool10;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (CancellationException e9) {
                                                                                                    i2 = 0;
                                                                                                    xgn0Var = xgn0Var;
                                                                                                    l811Var = l811Var;
                                                                                                    jb20Var = jb20Var4;
                                                                                                    i = 1;
                                                                                                    cancellationException = e9;
                                                                                                    d9nVar4 = d9nVar;
                                                                                                    i4 = i4;
                                                                                                    i3 = i8;
                                                                                                    m7m1Var4 = m7m1Var4;
                                                                                                    iyc0Var7 = null;
                                                                                                    if (i4 != 0) {
                                                                                                        iyc0Var = iyc0Var7;
                                                                                                        throw cancellationException;
                                                                                                    }
                                                                                                    if (jb20Var != null) {
                                                                                                        iyc0Var4 = jb20Var.a;
                                                                                                    } else {
                                                                                                        iyc0Var4 = iyc0Var7;
                                                                                                    }
                                                                                                    z4 = l811Var.a;
                                                                                                    if (i3 == 0) {
                                                                                                        i = i2;
                                                                                                    }
                                                                                                    if (z4) {
                                                                                                        iyc0Var5 = iyc0Var4;
                                                                                                    } else {
                                                                                                        iyc0Var5 = iyc0Var7;
                                                                                                    }
                                                                                                    m7m1Var.a = iyc0Var7;
                                                                                                    m7m1Var.b = iyc0Var7;
                                                                                                    m7m1Var.c = iyc0Var7;
                                                                                                    m7m1Var.d = cancellationException;
                                                                                                    m7m1Var.e = iyc0Var7;
                                                                                                    m7m1Var.f = i3;
                                                                                                    m7m1Var.g = i4;
                                                                                                    m7m1Var.t = 5;
                                                                                                    iyc0Var = iyc0Var7;
                                                                                                    if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                                        return d9nVar4;
                                                                                                    }
                                                                                                    cancellationException2 = cancellationException;
                                                                                                    throw cancellationException2;
                                                                                                    th = th5;
                                                                                                    m7m1Var4.l(iyc0Var);
                                                                                                    xgn0Var.c(iyc0Var);
                                                                                                    throw th;
                                                                                                } catch (Exception unused11) {
                                                                                                    i5 = 1;
                                                                                                    i3 = i8;
                                                                                                    str2 = str2;
                                                                                                    l811Var = l811Var;
                                                                                                    jb20Var2 = jb20Var4;
                                                                                                    i6 = 0;
                                                                                                    if (i4 == 0) {
                                                                                                        if (jb20Var2 != null) {
                                                                                                            str3 = jb20Var2.a;
                                                                                                        } else {
                                                                                                            str3 = null;
                                                                                                        }
                                                                                                        z2 = l811Var.a;
                                                                                                        d9nVar3 = d9nVar;
                                                                                                        if (i3 != 0) {
                                                                                                            z3 = i5;
                                                                                                        } else {
                                                                                                            z3 = i6;
                                                                                                        }
                                                                                                        if (!z2) {
                                                                                                            str3 = null;
                                                                                                        }
                                                                                                        m7m1Var.a = null;
                                                                                                        m7m1Var.b = null;
                                                                                                        m7m1Var.c = null;
                                                                                                        m7m1Var.d = null;
                                                                                                        m7m1Var.e = null;
                                                                                                        m7m1Var.f = i3;
                                                                                                        m7m1Var.g = i4;
                                                                                                        m7m1Var.t = 6;
                                                                                                        iyc0Var3 = null;
                                                                                                        z = i5;
                                                                                                        if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                            return d9nVar3;
                                                                                                        }
                                                                                                    } else {
                                                                                                        z = i5;
                                                                                                        iyc0Var3 = null;
                                                                                                    }
                                                                                                    kt91 kt91Var6 = this.f;
                                                                                                    n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                                                    n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                                                    iyc0 iyc0Var13 = iyc0Var3;
                                                                                                    kt91Var6.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                                    Boolean bool11 = Boolean.FALSE;
                                                                                                    m7m1Var4.l(iyc0Var13);
                                                                                                    xgn0Var.c(iyc0Var13);
                                                                                                    return bool11;
                                                                                                }
                                                                                            } catch (CancellationException e10) {
                                                                                                e = e10;
                                                                                                i4 = i4;
                                                                                                jb20Var = jb20Var2;
                                                                                                l811Var = l811Var2;
                                                                                                i = 1;
                                                                                                i2 = 0;
                                                                                                cancellationException = e;
                                                                                                d9nVar4 = d9nVar;
                                                                                                i3 = i8;
                                                                                                m7m1Var4 = m7m1Var4;
                                                                                                iyc0Var7 = null;
                                                                                                if (i4 != 0) {
                                                                                                    iyc0Var = iyc0Var7;
                                                                                                    throw cancellationException;
                                                                                                }
                                                                                                if (jb20Var != null) {
                                                                                                    iyc0Var4 = jb20Var.a;
                                                                                                } else {
                                                                                                    iyc0Var4 = iyc0Var7;
                                                                                                }
                                                                                                z4 = l811Var.a;
                                                                                                if (i3 == 0) {
                                                                                                    i = i2;
                                                                                                }
                                                                                                if (z4) {
                                                                                                    iyc0Var5 = iyc0Var4;
                                                                                                } else {
                                                                                                    iyc0Var5 = iyc0Var7;
                                                                                                }
                                                                                                m7m1Var.a = iyc0Var7;
                                                                                                m7m1Var.b = iyc0Var7;
                                                                                                m7m1Var.c = iyc0Var7;
                                                                                                m7m1Var.d = cancellationException;
                                                                                                m7m1Var.e = iyc0Var7;
                                                                                                m7m1Var.f = i3;
                                                                                                m7m1Var.g = i4;
                                                                                                m7m1Var.t = 5;
                                                                                                iyc0Var = iyc0Var7;
                                                                                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                                    return d9nVar4;
                                                                                                }
                                                                                                cancellationException2 = cancellationException;
                                                                                                throw cancellationException2;
                                                                                                th = th5;
                                                                                                m7m1Var4.l(iyc0Var);
                                                                                                xgn0Var.c(iyc0Var);
                                                                                                throw th;
                                                                                            } catch (Exception unused12) {
                                                                                                i3 = i8;
                                                                                                str2 = str2;
                                                                                                l811Var = l811Var2;
                                                                                                i5 = 1;
                                                                                                i6 = 0;
                                                                                                if (i4 == 0) {
                                                                                                    if (jb20Var2 != null) {
                                                                                                        str3 = jb20Var2.a;
                                                                                                    } else {
                                                                                                        str3 = null;
                                                                                                    }
                                                                                                    z2 = l811Var.a;
                                                                                                    d9nVar3 = d9nVar;
                                                                                                    if (i3 != 0) {
                                                                                                        z3 = i5;
                                                                                                    } else {
                                                                                                        z3 = i6;
                                                                                                    }
                                                                                                    if (!z2) {
                                                                                                        str3 = null;
                                                                                                    }
                                                                                                    m7m1Var.a = null;
                                                                                                    m7m1Var.b = null;
                                                                                                    m7m1Var.c = null;
                                                                                                    m7m1Var.d = null;
                                                                                                    m7m1Var.e = null;
                                                                                                    m7m1Var.f = i3;
                                                                                                    m7m1Var.g = i4;
                                                                                                    m7m1Var.t = 6;
                                                                                                    iyc0Var3 = null;
                                                                                                    z = i5;
                                                                                                    if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                        return d9nVar3;
                                                                                                    }
                                                                                                } else {
                                                                                                    z = i5;
                                                                                                    iyc0Var3 = null;
                                                                                                }
                                                                                                kt91 kt91Var7 = this.f;
                                                                                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                                                iyc0 iyc0Var14 = iyc0Var3;
                                                                                                kt91Var7.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                                Boolean bool12 = Boolean.FALSE;
                                                                                                m7m1Var4.l(iyc0Var14);
                                                                                                xgn0Var.c(iyc0Var14);
                                                                                                return bool12;
                                                                                            }
                                                                                        }
                                                                                        return d9nVar;
                                                                                    } catch (CancellationException e11) {
                                                                                        e = e11;
                                                                                        m7m1Var = m7m1Var2;
                                                                                        d9nVar4 = d9nVar;
                                                                                        iyc0Var7 = null;
                                                                                        i = 1;
                                                                                        i2 = 0;
                                                                                        cancellationException = e;
                                                                                        jb20Var = jb20Var4;
                                                                                        if (i4 != 0) {
                                                                                            iyc0Var = iyc0Var7;
                                                                                            throw cancellationException;
                                                                                        }
                                                                                        if (jb20Var != null) {
                                                                                            iyc0Var4 = jb20Var.a;
                                                                                        } else {
                                                                                            iyc0Var4 = iyc0Var7;
                                                                                        }
                                                                                        z4 = l811Var.a;
                                                                                        if (i3 == 0) {
                                                                                            i = i2;
                                                                                        }
                                                                                        if (z4) {
                                                                                            iyc0Var5 = iyc0Var4;
                                                                                        } else {
                                                                                            iyc0Var5 = iyc0Var7;
                                                                                        }
                                                                                        m7m1Var.a = iyc0Var7;
                                                                                        m7m1Var.b = iyc0Var7;
                                                                                        m7m1Var.c = iyc0Var7;
                                                                                        m7m1Var.d = cancellationException;
                                                                                        m7m1Var.e = iyc0Var7;
                                                                                        m7m1Var.f = i3;
                                                                                        m7m1Var.g = i4;
                                                                                        m7m1Var.t = 5;
                                                                                        iyc0Var = iyc0Var7;
                                                                                        if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                                                            return d9nVar4;
                                                                                        }
                                                                                        cancellationException2 = cancellationException;
                                                                                        throw cancellationException2;
                                                                                        th = th5;
                                                                                        m7m1Var4.l(iyc0Var);
                                                                                        xgn0Var.c(iyc0Var);
                                                                                        throw th;
                                                                                    } catch (Exception unused13) {
                                                                                        m7m1Var = m7m1Var2;
                                                                                        str2 = str2;
                                                                                        l811Var = l811Var;
                                                                                        jb20Var2 = jb20Var4;
                                                                                        i5 = 1;
                                                                                        i6 = 0;
                                                                                        if (i4 == 0) {
                                                                                            if (jb20Var2 != null) {
                                                                                                str3 = jb20Var2.a;
                                                                                            } else {
                                                                                                str3 = null;
                                                                                            }
                                                                                            z2 = l811Var.a;
                                                                                            d9nVar3 = d9nVar;
                                                                                            if (i3 != 0) {
                                                                                                z3 = i5;
                                                                                            } else {
                                                                                                z3 = i6;
                                                                                            }
                                                                                            if (!z2) {
                                                                                                str3 = null;
                                                                                            }
                                                                                            m7m1Var.a = null;
                                                                                            m7m1Var.b = null;
                                                                                            m7m1Var.c = null;
                                                                                            m7m1Var.d = null;
                                                                                            m7m1Var.e = null;
                                                                                            m7m1Var.f = i3;
                                                                                            m7m1Var.g = i4;
                                                                                            m7m1Var.t = 6;
                                                                                            iyc0Var3 = null;
                                                                                            z = i5;
                                                                                            if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                                                                return d9nVar3;
                                                                                            }
                                                                                        } else {
                                                                                            z = i5;
                                                                                            iyc0Var3 = null;
                                                                                        }
                                                                                        kt91 kt91Var8 = this.f;
                                                                                        n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                                                        n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                                                        iyc0 iyc0Var15 = iyc0Var3;
                                                                                        kt91Var8.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                                                        Boolean bool13 = Boolean.FALSE;
                                                                                        m7m1Var4.l(iyc0Var15);
                                                                                        xgn0Var.c(iyc0Var15);
                                                                                        return bool13;
                                                                                    }
                                                                                } catch (CancellationException e12) {
                                                                                    e = e12;
                                                                                    m7m1Var = m7m1Var;
                                                                                    d9nVar = d9nVar4;
                                                                                } catch (Exception unused14) {
                                                                                    m7m1Var = m7m1Var;
                                                                                    d9nVar = d9nVar4;
                                                                                }
                                                                            } catch (Exception unused15) {
                                                                                m7m1Var = m7m1Var;
                                                                                d9nVar = d9nVar4;
                                                                            }
                                                                        } catch (Exception unused16) {
                                                                            d9nVar = d9nVar4;
                                                                            i5 = 1;
                                                                            i6 = 0;
                                                                            jb20Var2 = jb20Var4;
                                                                        }
                                                                    } catch (CancellationException e13) {
                                                                        e = e13;
                                                                        m7m1Var = m7m1Var;
                                                                        d9nVar = d9nVar4;
                                                                    }
                                                                } catch (CancellationException e14) {
                                                                    m7m1Var = m7m1Var;
                                                                    i2 = 0;
                                                                    i = 1;
                                                                    iyc0Var7 = null;
                                                                    cancellationException = e14;
                                                                    d9nVar4 = d9nVar4;
                                                                } catch (Exception unused17) {
                                                                    d9nVar = d9nVar4;
                                                                    i5 = 1;
                                                                    i6 = 0;
                                                                }
                                                            } catch (Exception unused18) {
                                                                d9nVar = d9nVar4;
                                                                i5 = 1;
                                                                i6 = 0;
                                                                str2 = str2;
                                                                l811Var = l811Var;
                                                                jb20Var2 = null;
                                                            }
                                                        } catch (Exception unused19) {
                                                            d9nVar = d9nVar4;
                                                            num = num;
                                                        }
                                                    } catch (CancellationException e15) {
                                                        i2 = 0;
                                                        i = 1;
                                                        iyc0Var7 = null;
                                                        cancellationException = e15;
                                                        d9nVar4 = d9nVar4;
                                                    }
                                                    i5 = 1;
                                                    i6 = 0;
                                                    str2 = str2;
                                                    l811Var = l811Var;
                                                    jb20Var2 = null;
                                                    if (i4 == 0) {
                                                        if (jb20Var2 != null) {
                                                            str3 = jb20Var2.a;
                                                        } else {
                                                            str3 = null;
                                                        }
                                                        z2 = l811Var.a;
                                                        d9nVar3 = d9nVar;
                                                        if (i3 != 0) {
                                                            z3 = i5;
                                                        } else {
                                                            z3 = i6;
                                                        }
                                                        if (!z2) {
                                                            str3 = null;
                                                        }
                                                        m7m1Var.a = null;
                                                        m7m1Var.b = null;
                                                        m7m1Var.c = null;
                                                        m7m1Var.d = null;
                                                        m7m1Var.e = null;
                                                        m7m1Var.f = i3;
                                                        m7m1Var.g = i4;
                                                        m7m1Var.t = 6;
                                                        iyc0Var3 = null;
                                                        z = i5;
                                                        if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                            return d9nVar3;
                                                        }
                                                    } else {
                                                        z = i5;
                                                        iyc0Var3 = null;
                                                    }
                                                    try {
                                                        kt91 kt91Var9 = this.f;
                                                        n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                                        n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                                        iyc0 iyc0Var16 = iyc0Var3;
                                                        kt91Var9.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                                        Boolean bool14 = Boolean.FALSE;
                                                        m7m1Var4.l(iyc0Var16);
                                                        xgn0Var.c(iyc0Var16);
                                                        return bool14;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        xgn0Var = xgn0Var;
                                                    }
                                                } catch (CancellationException e16) {
                                                    e = e16;
                                                    m7m1Var = m7m1Var;
                                                    d9nVar2 = d9nVar4;
                                                    i7 = 1;
                                                    i2 = 0;
                                                    l811Var = l811Var4;
                                                    xgn0Var = xgn0Var;
                                                    i = i7;
                                                    i4 = i2;
                                                    iyc0Var7 = null;
                                                    jb20Var = null;
                                                    cancellationException = e;
                                                    d9nVar4 = d9nVar2;
                                                    m7m1Var4 = m7m1Var4;
                                                    i3 = i4;
                                                    if (i4 != 0) {
                                                        iyc0Var = iyc0Var7;
                                                        throw cancellationException;
                                                    }
                                                    if (jb20Var != null) {
                                                        iyc0Var4 = jb20Var.a;
                                                    } else {
                                                        iyc0Var4 = iyc0Var7;
                                                    }
                                                    z4 = l811Var.a;
                                                    if (i3 == 0) {
                                                        i = i2;
                                                    }
                                                    if (z4) {
                                                        iyc0Var5 = iyc0Var4;
                                                    } else {
                                                        iyc0Var5 = iyc0Var7;
                                                    }
                                                    m7m1Var.a = iyc0Var7;
                                                    m7m1Var.b = iyc0Var7;
                                                    m7m1Var.c = iyc0Var7;
                                                    m7m1Var.d = cancellationException;
                                                    m7m1Var.e = iyc0Var7;
                                                    m7m1Var.f = i3;
                                                    m7m1Var.g = i4;
                                                    m7m1Var.t = 5;
                                                    iyc0Var = iyc0Var7;
                                                    if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                        return d9nVar4;
                                                    }
                                                    cancellationException2 = cancellationException;
                                                    throw cancellationException2;
                                                    th = th5;
                                                    m7m1Var4.l(iyc0Var);
                                                    xgn0Var.c(iyc0Var);
                                                    throw th;
                                                } catch (Exception unused20) {
                                                    m7m1Var = m7m1Var;
                                                    d9nVar = d9nVar4;
                                                    i5 = 1;
                                                    i6 = 0;
                                                    l811Var = l811Var4;
                                                    str2 = str2;
                                                    i4 = i6;
                                                    i3 = i4;
                                                }
                                            } catch (CancellationException e17) {
                                                e = e17;
                                                m7m1Var = m7m1Var;
                                                d9nVar2 = d9nVar4;
                                                i2 = 0;
                                                i7 = 1;
                                                l811Var = l811Var4;
                                                xgn0Var = xgn0Var;
                                                i = i7;
                                                i4 = i2;
                                                iyc0Var7 = null;
                                                jb20Var = null;
                                                cancellationException = e;
                                                d9nVar4 = d9nVar2;
                                                m7m1Var4 = m7m1Var4;
                                                i3 = i4;
                                                if (i4 != 0) {
                                                    iyc0Var = iyc0Var7;
                                                    throw cancellationException;
                                                }
                                                if (jb20Var != null) {
                                                    iyc0Var4 = jb20Var.a;
                                                } else {
                                                    iyc0Var4 = iyc0Var7;
                                                }
                                                z4 = l811Var.a;
                                                if (i3 == 0) {
                                                    i = i2;
                                                }
                                                if (z4) {
                                                    iyc0Var5 = iyc0Var4;
                                                } else {
                                                    iyc0Var5 = iyc0Var7;
                                                }
                                                m7m1Var.a = iyc0Var7;
                                                m7m1Var.b = iyc0Var7;
                                                m7m1Var.c = iyc0Var7;
                                                m7m1Var.d = cancellationException;
                                                m7m1Var.e = iyc0Var7;
                                                m7m1Var.f = i3;
                                                m7m1Var.g = i4;
                                                m7m1Var.t = 5;
                                                iyc0Var = iyc0Var7;
                                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                    return d9nVar4;
                                                }
                                                cancellationException2 = cancellationException;
                                                throw cancellationException2;
                                                th = th5;
                                                m7m1Var4.l(iyc0Var);
                                                xgn0Var.c(iyc0Var);
                                                throw th;
                                            } catch (Exception unused21) {
                                                m7m1Var = m7m1Var;
                                                d9nVar = d9nVar4;
                                                i6 = 0;
                                                num = num;
                                                i5 = 1;
                                                l811Var = l811Var4;
                                                str2 = str2;
                                                i4 = i6;
                                                i3 = i4;
                                            }
                                        } catch (CancellationException e18) {
                                            e = e18;
                                            d9nVar2 = d9nVar4;
                                            i7 = 1;
                                            i2 = 0;
                                            l811Var = l811Var4;
                                            xgn0Var = xgn0Var;
                                            i = i7;
                                            i4 = i2;
                                            iyc0Var7 = null;
                                            jb20Var = null;
                                            cancellationException = e;
                                            d9nVar4 = d9nVar2;
                                            m7m1Var4 = m7m1Var4;
                                            i3 = i4;
                                            if (i4 != 0) {
                                                iyc0Var = iyc0Var7;
                                                throw cancellationException;
                                            }
                                            if (jb20Var != null) {
                                                iyc0Var4 = jb20Var.a;
                                            } else {
                                                iyc0Var4 = iyc0Var7;
                                            }
                                            z4 = l811Var.a;
                                            if (i3 == 0) {
                                                i = i2;
                                            }
                                            if (z4) {
                                                iyc0Var5 = iyc0Var4;
                                            } else {
                                                iyc0Var5 = iyc0Var7;
                                            }
                                            m7m1Var.a = iyc0Var7;
                                            m7m1Var.b = iyc0Var7;
                                            m7m1Var.c = iyc0Var7;
                                            m7m1Var.d = cancellationException;
                                            m7m1Var.e = iyc0Var7;
                                            m7m1Var.f = i3;
                                            m7m1Var.g = i4;
                                            m7m1Var.t = 5;
                                            iyc0Var = iyc0Var7;
                                            if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                                return d9nVar4;
                                            }
                                            cancellationException2 = cancellationException;
                                            throw cancellationException2;
                                            th = th5;
                                            m7m1Var4.l(iyc0Var);
                                            xgn0Var.c(iyc0Var);
                                            throw th;
                                        } catch (Exception unused22) {
                                            d9nVar = d9nVar4;
                                            i5 = 1;
                                            i6 = 0;
                                            l811Var = l811Var4;
                                            str2 = str2;
                                            i4 = i6;
                                            i3 = i4;
                                            jb20Var2 = null;
                                            if (i4 == 0) {
                                                if (jb20Var2 != null) {
                                                    str3 = jb20Var2.a;
                                                } else {
                                                    str3 = null;
                                                }
                                                z2 = l811Var.a;
                                                d9nVar3 = d9nVar;
                                                if (i3 != 0) {
                                                    z3 = i5;
                                                } else {
                                                    z3 = i6;
                                                }
                                                if (!z2) {
                                                    str3 = null;
                                                }
                                                m7m1Var.a = null;
                                                m7m1Var.b = null;
                                                m7m1Var.c = null;
                                                m7m1Var.d = null;
                                                m7m1Var.e = null;
                                                m7m1Var.f = i3;
                                                m7m1Var.g = i4;
                                                m7m1Var.t = 6;
                                                iyc0Var3 = null;
                                                z = i5;
                                                if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                                    return d9nVar3;
                                                }
                                            } else {
                                                z = i5;
                                                iyc0Var3 = null;
                                            }
                                            kt91 kt91Var10 = this.f;
                                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                            iyc0 iyc0Var17 = iyc0Var3;
                                            kt91Var10.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                            Boolean bool15 = Boolean.FALSE;
                                            m7m1Var4.l(iyc0Var17);
                                            xgn0Var.c(iyc0Var17);
                                            return bool15;
                                        }
                                    } catch (CancellationException e19) {
                                        e = e19;
                                        d9nVar2 = d9nVar4;
                                        str2 = str;
                                    }
                                } catch (Exception unused23) {
                                    d9nVar = d9nVar4;
                                    str2 = str;
                                }
                            } catch (CancellationException e20) {
                                str2 = str;
                                xgn0Var = xgn0Var;
                                d9nVar4 = d9nVar4;
                                iyc0Var7 = null;
                                i = 1;
                                i2 = 0;
                                m7m1Var = m7m1Var;
                                m7m1Var4 = m7m1Var4;
                                cancellationException = e20;
                                l811Var = l811Var4;
                                jb20Var = null;
                                i3 = 0;
                                i4 = 0;
                            }
                            break;
                        case 1:
                            i4 = m7m1Var.g;
                            i9 = m7m1Var.f;
                            l811 l811Var5 = (l811) m7m1Var.b;
                            String str8 = m7m1Var.a;
                            try {
                                hm5.M(objB);
                                i3 = i9;
                                str2 = str8;
                                l811Var = l811Var5;
                                list = (List) objB;
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        iyc0Var2 = iyc0Var6;
                                        if (u890.j(((jb20) next).a, str2)) {
                                            iyc0Var6 = iyc0Var2;
                                        }
                                    } else {
                                        iyc0Var2 = iyc0Var6;
                                        next = null;
                                    }
                                }
                                jb20Var3 = (jb20) next;
                                if (jb20Var3 == null) {
                                    Boolean bool16 = Boolean.TRUE;
                                    m7m1Var4.l((Object) null);
                                    xgn0Var.c((Object) null);
                                    return bool16;
                                }
                                it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        num = num;
                                        if (((jb20) next2).c) {
                                        }
                                    } else {
                                        num = num;
                                        next2 = null;
                                    }
                                }
                                jb20Var4 = (jb20) next2;
                                m7m1Var4.m((Object) null, new l7m1(list));
                                if (jb20Var4 != null) {
                                    m7m1Var = m7m1Var;
                                    d9nVar = d9nVar4;
                                    int i16 = i3;
                                    jb20Var5 = jb20Var3;
                                    i8 = i16;
                                    if (jb20Var5.c) {
                                        String str9 = jb20Var5.a;
                                        m7m1Var.a = str2;
                                        m7m1Var.b = jb20Var4;
                                        m7m1Var.c = l811Var;
                                        m7m1Var.d = null;
                                        m7m1Var.e = jb20Var5;
                                        m7m1Var.f = 1;
                                        m7m1Var.g = i4;
                                        m7m1Var.t = 3;
                                        m7m1Var3 = m7m1Var;
                                        objB = ((xyc0) iyc0Var2).p(str4, str9, true, false, m7m1Var3);
                                        m7m1Var = m7m1Var3;
                                        if (objB != d9nVar) {
                                            jb20Var6 = jb20Var5;
                                            l811Var3 = l811Var;
                                            jb20Var7 = jb20Var4;
                                            i8 = 1;
                                            ((py21) objB).d();
                                            jb20Var5 = jb20Var6;
                                            l811Var = l811Var3;
                                            jb20Var2 = jb20Var7;
                                            gqj1 gqj1Var5 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                            m7m1Var.a = str2;
                                            m7m1Var.b = jb20Var2;
                                            m7m1Var.c = l811Var;
                                            m7m1Var.d = null;
                                            m7m1Var.e = null;
                                            m7m1Var.f = i8;
                                            i5 = 1;
                                            m7m1Var.g = 1;
                                            m7m1Var.t = 4;
                                            objB = rc2.O(5000L, gqj1Var5, m7m1Var);
                                            if (objB != d9nVar) {
                                                i4 = 1;
                                                if (((cxc0) objB) == null) {
                                                    i11 = 0;
                                                    Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                                } else {
                                                    i11 = 0;
                                                }
                                                Boolean bool17 = Boolean.TRUE;
                                                m7m1Var4.l((Object) null);
                                                xgn0Var.c((Object) null);
                                                return bool17;
                                            }
                                        }
                                    } else {
                                        l811Var = l811Var;
                                        jb20Var2 = jb20Var4;
                                        gqj1 gqj1Var6 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                        m7m1Var.a = str2;
                                        m7m1Var.b = jb20Var2;
                                        m7m1Var.c = l811Var;
                                        m7m1Var.d = null;
                                        m7m1Var.e = null;
                                        m7m1Var.f = i8;
                                        i5 = 1;
                                        m7m1Var.g = 1;
                                        m7m1Var.t = 4;
                                        objB = rc2.O(5000L, gqj1Var6, m7m1Var);
                                        if (objB != d9nVar) {
                                            i4 = 1;
                                            if (((cxc0) objB) == null) {
                                                i11 = 0;
                                                Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                            } else {
                                                i11 = 0;
                                            }
                                            Boolean bool18 = Boolean.TRUE;
                                            m7m1Var4.l((Object) null);
                                            xgn0Var.c((Object) null);
                                            return bool18;
                                        }
                                    }
                                    return d9nVar;
                                }
                                l811Var.a = true;
                                String str10 = jb20Var4.a;
                                m7m1Var.a = str2;
                                m7m1Var.b = jb20Var4;
                                m7m1Var.c = l811Var;
                                m7m1Var.d = null;
                                m7m1Var.e = jb20Var3;
                                m7m1Var.f = i3;
                                m7m1Var.g = i4;
                                m7m1Var.t = 2;
                                m7m1Var2 = m7m1Var;
                                d9nVar = d9nVar4;
                                objB = ((xyc0) iyc0Var2).p(str4, str10, false, false, m7m1Var2);
                                m7m1Var = m7m1Var2;
                                if (objB != d9nVar) {
                                    int i17 = i3;
                                    jb20Var5 = jb20Var3;
                                    i8 = i17;
                                    l811Var2 = l811Var;
                                    jb20Var2 = jb20Var4;
                                    ((py21) objB).d();
                                    jb20Var4 = jb20Var2;
                                    l811Var = l811Var2;
                                    if (jb20Var5.c) {
                                        String str11 = jb20Var5.a;
                                        m7m1Var.a = str2;
                                        m7m1Var.b = jb20Var4;
                                        m7m1Var.c = l811Var;
                                        m7m1Var.d = null;
                                        m7m1Var.e = jb20Var5;
                                        m7m1Var.f = 1;
                                        m7m1Var.g = i4;
                                        m7m1Var.t = 3;
                                        m7m1Var3 = m7m1Var;
                                        objB = ((xyc0) iyc0Var2).p(str4, str11, true, false, m7m1Var3);
                                        m7m1Var = m7m1Var3;
                                        if (objB != d9nVar) {
                                            jb20Var6 = jb20Var5;
                                            l811Var3 = l811Var;
                                            jb20Var7 = jb20Var4;
                                            i8 = 1;
                                            ((py21) objB).d();
                                            jb20Var5 = jb20Var6;
                                            l811Var = l811Var3;
                                            jb20Var2 = jb20Var7;
                                            gqj1 gqj1Var7 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                            m7m1Var.a = str2;
                                            m7m1Var.b = jb20Var2;
                                            m7m1Var.c = l811Var;
                                            m7m1Var.d = null;
                                            m7m1Var.e = null;
                                            m7m1Var.f = i8;
                                            i5 = 1;
                                            m7m1Var.g = 1;
                                            m7m1Var.t = 4;
                                            objB = rc2.O(5000L, gqj1Var7, m7m1Var);
                                            if (objB != d9nVar) {
                                                i4 = 1;
                                                if (((cxc0) objB) == null) {
                                                    i11 = 0;
                                                    Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                                } else {
                                                    i11 = 0;
                                                }
                                                Boolean bool19 = Boolean.TRUE;
                                                m7m1Var4.l((Object) null);
                                                xgn0Var.c((Object) null);
                                                return bool19;
                                            }
                                        }
                                    } else {
                                        l811Var = l811Var;
                                        jb20Var2 = jb20Var4;
                                        gqj1 gqj1Var8 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                        m7m1Var.a = str2;
                                        m7m1Var.b = jb20Var2;
                                        m7m1Var.c = l811Var;
                                        m7m1Var.d = null;
                                        m7m1Var.e = null;
                                        m7m1Var.f = i8;
                                        i5 = 1;
                                        m7m1Var.g = 1;
                                        m7m1Var.t = 4;
                                        objB = rc2.O(5000L, gqj1Var8, m7m1Var);
                                        if (objB != d9nVar) {
                                            i4 = 1;
                                            if (((cxc0) objB) == null) {
                                                i11 = 0;
                                                Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                            } else {
                                                i11 = 0;
                                            }
                                            Boolean bool110 = Boolean.TRUE;
                                            m7m1Var4.l((Object) null);
                                            xgn0Var.c((Object) null);
                                            return bool110;
                                        }
                                    }
                                }
                                return d9nVar;
                                i5 = 1;
                                i6 = 0;
                                str2 = str2;
                                l811Var = l811Var;
                            } catch (CancellationException e21) {
                                l811Var = l811Var5;
                                xgn0Var = xgn0Var;
                                d9nVar4 = d9nVar4;
                                iyc0Var7 = null;
                                jb20Var = null;
                                i = 1;
                                i2 = 0;
                                cancellationException = e21;
                                m7m1Var = m7m1Var;
                                i3 = i9;
                                m7m1Var4 = m7m1Var4;
                                str2 = str8;
                                i4 = i4;
                                if (i4 != 0) {
                                    iyc0Var = iyc0Var7;
                                    throw cancellationException;
                                }
                                if (jb20Var != null) {
                                    iyc0Var4 = jb20Var.a;
                                } else {
                                    iyc0Var4 = iyc0Var7;
                                }
                                z4 = l811Var.a;
                                if (i3 == 0) {
                                    i = i2;
                                }
                                if (z4) {
                                    iyc0Var5 = iyc0Var4;
                                } else {
                                    iyc0Var5 = iyc0Var7;
                                }
                                m7m1Var.a = iyc0Var7;
                                m7m1Var.b = iyc0Var7;
                                m7m1Var.c = iyc0Var7;
                                m7m1Var.d = cancellationException;
                                m7m1Var.e = iyc0Var7;
                                m7m1Var.f = i3;
                                m7m1Var.g = i4;
                                m7m1Var.t = 5;
                                iyc0Var = iyc0Var7;
                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                    return d9nVar4;
                                }
                                cancellationException2 = cancellationException;
                                throw cancellationException2;
                                th = th5;
                                m7m1Var4.l(iyc0Var);
                                xgn0Var.c(iyc0Var);
                                throw th;
                            } catch (Exception unused24) {
                                d9nVar = d9nVar4;
                                l811Var = l811Var5;
                                str2 = str8;
                                jb20Var2 = null;
                                i5 = 1;
                                i6 = 0;
                                i3 = i9;
                            }
                            jb20Var2 = null;
                            if (i4 == 0) {
                                if (jb20Var2 != null) {
                                    str3 = jb20Var2.a;
                                } else {
                                    str3 = null;
                                }
                                z2 = l811Var.a;
                                d9nVar3 = d9nVar;
                                if (i3 != 0) {
                                    z3 = i5;
                                } else {
                                    z3 = i6;
                                }
                                if (!z2) {
                                    str3 = null;
                                }
                                m7m1Var.a = null;
                                m7m1Var.b = null;
                                m7m1Var.c = null;
                                m7m1Var.d = null;
                                m7m1Var.e = null;
                                m7m1Var.f = i3;
                                m7m1Var.g = i4;
                                m7m1Var.t = 6;
                                iyc0Var3 = null;
                                z = i5;
                                if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                    return d9nVar3;
                                }
                            } else {
                                z = i5;
                                iyc0Var3 = null;
                            }
                            kt91 kt91Var11 = this.f;
                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                            iyc0 iyc0Var18 = iyc0Var3;
                            kt91Var11.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                            Boolean bool111 = Boolean.FALSE;
                            m7m1Var4.l(iyc0Var18);
                            xgn0Var.c(iyc0Var18);
                            return bool111;
                        case 2:
                            i4 = m7m1Var.g;
                            i9 = m7m1Var.f;
                            jb20 jb20Var8 = m7m1Var.e;
                            l811Var2 = m7m1Var.c;
                            jb20 jb20Var9 = (jb20) m7m1Var.b;
                            String str12 = m7m1Var.a;
                            try {
                                hm5.M(objB);
                                m7m1Var = m7m1Var;
                                d9nVar = d9nVar4;
                                iyc0Var2 = iyc0Var6;
                                i8 = i9;
                                str2 = str12;
                                num = num;
                                jb20Var5 = jb20Var8;
                                jb20Var2 = jb20Var9;
                                ((py21) objB).d();
                                jb20Var4 = jb20Var2;
                                l811Var = l811Var2;
                                if (jb20Var5.c) {
                                    String str13 = jb20Var5.a;
                                    m7m1Var.a = str2;
                                    m7m1Var.b = jb20Var4;
                                    m7m1Var.c = l811Var;
                                    m7m1Var.d = null;
                                    m7m1Var.e = jb20Var5;
                                    m7m1Var.f = 1;
                                    m7m1Var.g = i4;
                                    m7m1Var.t = 3;
                                    m7m1Var3 = m7m1Var;
                                    objB = ((xyc0) iyc0Var2).p(str4, str13, true, false, m7m1Var3);
                                    m7m1Var = m7m1Var3;
                                    if (objB != d9nVar) {
                                        jb20Var6 = jb20Var5;
                                        l811Var3 = l811Var;
                                        jb20Var7 = jb20Var4;
                                        i8 = 1;
                                        ((py21) objB).d();
                                        jb20Var5 = jb20Var6;
                                        l811Var = l811Var3;
                                        jb20Var2 = jb20Var7;
                                        gqj1 gqj1Var9 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                        m7m1Var.a = str2;
                                        m7m1Var.b = jb20Var2;
                                        m7m1Var.c = l811Var;
                                        m7m1Var.d = null;
                                        m7m1Var.e = null;
                                        m7m1Var.f = i8;
                                        i5 = 1;
                                        m7m1Var.g = 1;
                                        m7m1Var.t = 4;
                                        objB = rc2.O(5000L, gqj1Var9, m7m1Var);
                                        if (objB != d9nVar) {
                                            i4 = 1;
                                            if (((cxc0) objB) == null) {
                                                i11 = 0;
                                                Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                            } else {
                                                i11 = 0;
                                            }
                                            Boolean bool112 = Boolean.TRUE;
                                            m7m1Var4.l((Object) null);
                                            xgn0Var.c((Object) null);
                                            return bool112;
                                        }
                                    }
                                } else {
                                    l811Var = l811Var;
                                    jb20Var2 = jb20Var4;
                                    gqj1 gqj1Var10 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                    m7m1Var.a = str2;
                                    m7m1Var.b = jb20Var2;
                                    m7m1Var.c = l811Var;
                                    m7m1Var.d = null;
                                    m7m1Var.e = null;
                                    m7m1Var.f = i8;
                                    i5 = 1;
                                    m7m1Var.g = 1;
                                    m7m1Var.t = 4;
                                    objB = rc2.O(5000L, gqj1Var10, m7m1Var);
                                    if (objB != d9nVar) {
                                        i4 = 1;
                                        if (((cxc0) objB) == null) {
                                            i11 = 0;
                                            Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                        } else {
                                            i11 = 0;
                                        }
                                        Boolean bool113 = Boolean.TRUE;
                                        m7m1Var4.l((Object) null);
                                        xgn0Var.c((Object) null);
                                        return bool113;
                                    }
                                }
                                return d9nVar;
                            } catch (CancellationException e22) {
                                xgn0Var = xgn0Var;
                                l811Var = l811Var2;
                                iyc0Var7 = null;
                                i = 1;
                                i2 = 0;
                                cancellationException = e22;
                                i3 = i9;
                                str2 = str12;
                                jb20Var = jb20Var9;
                                d9nVar4 = d9nVar4;
                                i4 = i4;
                                m7m1Var4 = m7m1Var4;
                                if (i4 != 0) {
                                    iyc0Var = iyc0Var7;
                                    throw cancellationException;
                                }
                                if (jb20Var != null) {
                                    iyc0Var4 = jb20Var.a;
                                } else {
                                    iyc0Var4 = iyc0Var7;
                                }
                                z4 = l811Var.a;
                                if (i3 == 0) {
                                    i = i2;
                                }
                                if (z4) {
                                    iyc0Var5 = iyc0Var4;
                                } else {
                                    iyc0Var5 = iyc0Var7;
                                }
                                m7m1Var.a = iyc0Var7;
                                m7m1Var.b = iyc0Var7;
                                m7m1Var.c = iyc0Var7;
                                m7m1Var.d = cancellationException;
                                m7m1Var.e = iyc0Var7;
                                m7m1Var.f = i3;
                                m7m1Var.g = i4;
                                m7m1Var.t = 5;
                                iyc0Var = iyc0Var7;
                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                    return d9nVar4;
                                }
                                cancellationException2 = cancellationException;
                                throw cancellationException2;
                                th = th5;
                                m7m1Var4.l(iyc0Var);
                                xgn0Var.c(iyc0Var);
                                throw th;
                            } catch (Exception unused25) {
                                d9nVar = d9nVar4;
                                str2 = str12;
                                jb20Var2 = jb20Var9;
                                l811Var = l811Var2;
                                i5 = 1;
                                i6 = 0;
                                i3 = i9;
                            }
                            break;
                        case 3:
                            i4 = m7m1Var.g;
                            i8 = m7m1Var.f;
                            jb20Var6 = m7m1Var.e;
                            l811Var3 = m7m1Var.c;
                            jb20Var7 = (jb20) m7m1Var.b;
                            str2 = m7m1Var.a;
                            try {
                                hm5.M(objB);
                                m7m1Var = m7m1Var;
                                d9nVar = d9nVar4;
                                num = num;
                                ((py21) objB).d();
                                jb20Var5 = jb20Var6;
                                l811Var = l811Var3;
                                jb20Var2 = jb20Var7;
                                gqj1 gqj1Var11 = new gqj1(this, jb20Var5, (lnm) null, (byte) 27);
                                m7m1Var.a = str2;
                                m7m1Var.b = jb20Var2;
                                m7m1Var.c = l811Var;
                                m7m1Var.d = null;
                                m7m1Var.e = null;
                                m7m1Var.f = i8;
                                i5 = 1;
                                m7m1Var.g = 1;
                                m7m1Var.t = 4;
                                objB = rc2.O(5000L, gqj1Var11, m7m1Var);
                                if (objB != d9nVar) {
                                    i4 = 1;
                                    if (((cxc0) objB) == null) {
                                        i11 = 0;
                                        Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                    } else {
                                        i11 = 0;
                                    }
                                    Boolean bool114 = Boolean.TRUE;
                                    m7m1Var4.l((Object) null);
                                    xgn0Var.c((Object) null);
                                    return bool114;
                                }
                                return d9nVar;
                            } catch (CancellationException e23) {
                                i4 = i4;
                                l811Var = l811Var3;
                                i = 1;
                                i2 = 0;
                                cancellationException = e23;
                                i3 = i8;
                                jb20Var = jb20Var7;
                                m7m1Var4 = m7m1Var4;
                                if (i4 != 0) {
                                    iyc0Var = iyc0Var7;
                                    throw cancellationException;
                                }
                                if (jb20Var != null) {
                                    iyc0Var4 = jb20Var.a;
                                } else {
                                    iyc0Var4 = iyc0Var7;
                                }
                                z4 = l811Var.a;
                                if (i3 == 0) {
                                    i = i2;
                                }
                                if (z4) {
                                    iyc0Var5 = iyc0Var4;
                                } else {
                                    iyc0Var5 = iyc0Var7;
                                }
                                m7m1Var.a = iyc0Var7;
                                m7m1Var.b = iyc0Var7;
                                m7m1Var.c = iyc0Var7;
                                m7m1Var.d = cancellationException;
                                m7m1Var.e = iyc0Var7;
                                m7m1Var.f = i3;
                                m7m1Var.g = i4;
                                m7m1Var.t = 5;
                                iyc0Var = iyc0Var7;
                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                    return d9nVar4;
                                }
                                cancellationException2 = cancellationException;
                                throw cancellationException2;
                                th = th5;
                                m7m1Var4.l(iyc0Var);
                                xgn0Var.c(iyc0Var);
                                throw th;
                            } catch (Exception unused26) {
                                m7m1Var = m7m1Var;
                                d9nVar = d9nVar4;
                                i3 = i8;
                                str2 = str2;
                                num = num;
                                l811Var = l811Var3;
                                jb20Var2 = jb20Var7;
                                i5 = 1;
                                i6 = 0;
                                if (i4 == 0) {
                                    if (jb20Var2 != null) {
                                        str3 = jb20Var2.a;
                                    } else {
                                        str3 = null;
                                    }
                                    z2 = l811Var.a;
                                    d9nVar3 = d9nVar;
                                    if (i3 != 0) {
                                        z3 = i5;
                                    } else {
                                        z3 = i6;
                                    }
                                    if (!z2) {
                                        str3 = null;
                                    }
                                    m7m1Var.a = null;
                                    m7m1Var.b = null;
                                    m7m1Var.c = null;
                                    m7m1Var.d = null;
                                    m7m1Var.e = null;
                                    m7m1Var.f = i3;
                                    m7m1Var.g = i4;
                                    m7m1Var.t = 6;
                                    iyc0Var3 = null;
                                    z = i5;
                                    if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                        return d9nVar3;
                                    }
                                } else {
                                    z = i5;
                                    iyc0Var3 = null;
                                }
                                kt91 kt91Var12 = this.f;
                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                iyc0 iyc0Var19 = iyc0Var3;
                                kt91Var12.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                Boolean bool115 = Boolean.FALSE;
                                m7m1Var4.l(iyc0Var19);
                                xgn0Var.c(iyc0Var19);
                                return bool115;
                            }
                        case 4:
                            i4 = m7m1Var.g;
                            i8 = m7m1Var.f;
                            l811Var = m7m1Var.c;
                            jb20Var2 = (jb20) m7m1Var.b;
                            String str14 = m7m1Var.a;
                            try {
                                hm5.M(objB);
                                m7m1Var = m7m1Var;
                                d9nVar = d9nVar4;
                                num = num;
                                str2 = str14;
                                i5 = 1;
                                if (((cxc0) objB) == null) {
                                    i11 = 0;
                                    Logger.k("Timeout waiting for Wrapped chip metadata to update", new Object[0]);
                                } else {
                                    i11 = 0;
                                }
                                Boolean bool116 = Boolean.TRUE;
                                m7m1Var4.l((Object) null);
                                xgn0Var.c((Object) null);
                                return bool116;
                            } catch (CancellationException e24) {
                                i4 = i4;
                                str2 = str14;
                                i2 = 0;
                                cancellationException = e24;
                                i3 = i8;
                                jb20Var = jb20Var2;
                                i = 1;
                                m7m1Var4 = m7m1Var4;
                                if (i4 != 0) {
                                    iyc0Var = iyc0Var7;
                                    throw cancellationException;
                                }
                                if (jb20Var != null) {
                                    iyc0Var4 = jb20Var.a;
                                } else {
                                    iyc0Var4 = iyc0Var7;
                                }
                                z4 = l811Var.a;
                                if (i3 == 0) {
                                    i = i2;
                                }
                                if (z4) {
                                    iyc0Var5 = iyc0Var4;
                                } else {
                                    iyc0Var5 = iyc0Var7;
                                }
                                m7m1Var.a = iyc0Var7;
                                m7m1Var.b = iyc0Var7;
                                m7m1Var.c = iyc0Var7;
                                m7m1Var.d = cancellationException;
                                m7m1Var.e = iyc0Var7;
                                m7m1Var.f = i3;
                                m7m1Var.g = i4;
                                m7m1Var.t = 5;
                                iyc0Var = iyc0Var7;
                                if (fn31.Y(geo0.b, new du2(i, iyc0Var5, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar4) {
                                    return d9nVar4;
                                }
                                cancellationException2 = cancellationException;
                                throw cancellationException2;
                                th = th5;
                                m7m1Var4.l(iyc0Var);
                                xgn0Var.c(iyc0Var);
                                throw th;
                            } catch (Exception unused27) {
                                m7m1Var = m7m1Var;
                                d9nVar = d9nVar4;
                                i3 = i8;
                                num = num;
                                str2 = str14;
                                i5 = 1;
                                i6 = 0;
                                if (i4 == 0) {
                                    if (jb20Var2 != null) {
                                        str3 = jb20Var2.a;
                                    } else {
                                        str3 = null;
                                    }
                                    z2 = l811Var.a;
                                    d9nVar3 = d9nVar;
                                    if (i3 != 0) {
                                        z3 = i5;
                                    } else {
                                        z3 = i6;
                                    }
                                    if (!z2) {
                                        str3 = null;
                                    }
                                    m7m1Var.a = null;
                                    m7m1Var.b = null;
                                    m7m1Var.c = null;
                                    m7m1Var.d = null;
                                    m7m1Var.e = null;
                                    m7m1Var.f = i3;
                                    m7m1Var.g = i4;
                                    m7m1Var.t = 6;
                                    iyc0Var3 = null;
                                    z = i5;
                                    if (fn31.Y(geo0.b, new du2(z3, str3, this, str2, (lnm) null, (byte) 26), m7m1Var) == d9nVar3) {
                                        return d9nVar3;
                                    }
                                } else {
                                    z = i5;
                                    iyc0Var3 = null;
                                }
                                kt91 kt91Var13 = this.f;
                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                                n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                                iyc0 iyc0Var110 = iyc0Var3;
                                kt91Var13.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                                Boolean bool117 = Boolean.FALSE;
                                m7m1Var4.l(iyc0Var110);
                                xgn0Var.c(iyc0Var110);
                                return bool117;
                            }
                        case 5:
                            cancellationException2 = m7m1Var.d;
                            hm5.M(objB);
                            throw cancellationException2;
                        case 6:
                            hm5.M(objB);
                            iyc0Var3 = null;
                            num = num;
                            z = 1;
                            i6 = 0;
                            kt91 kt91Var14 = this.f;
                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                            n57.k(z, "Invalid resource ID provided: %s", new Object[]{iyc0Var3});
                            iyc0 iyc0Var111 = iyc0Var3;
                            kt91Var14.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, i6));
                            Boolean bool118 = Boolean.FALSE;
                            m7m1Var4.l(iyc0Var111);
                            xgn0Var.c(iyc0Var111);
                            return bool118;
                        default:
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    iyc0Var = null;
                    xgn0Var = xgn0Var;
                    m7m1Var4 = m7m1Var4;
                }
            } catch (Throwable th8) {
                th = th8;
                xgn0Var = xgn0Var;
                m7m1Var4 = m7m1Var4;
                iyc0Var = null;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        n7m1 n7m1Var;
        nfa0 nfa0Var;
        if (onmVar instanceof n7m1) {
            n7m1Var = (n7m1) onmVar;
            int i = n7m1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7m1Var.d = i - Integer.MIN_VALUE;
            } else {
                n7m1Var = new n7m1(this, onmVar);
            }
        } else {
            n7m1Var = new n7m1(this, onmVar);
        }
        Object objI = n7m1Var.b;
        int i2 = n7m1Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            any anyVarD = ((roc0) this.b).d();
            nfa0Var = this.d;
            n7m1Var.a = nfa0Var;
            n7m1Var.d = 1;
            objI = b5p1.i(anyVarD, n7m1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nfa0Var = n7m1Var.a;
            hm5.M(objI);
        }
        return wb20.a(((cxc0) objI).f.q, nfa0Var).b;
    }
}
