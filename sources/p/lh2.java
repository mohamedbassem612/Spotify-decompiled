package p;

import android.content.Intent;
import android.content.res.Resources;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class lh2 extends tv30 implements xu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh2(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0200  */
    /* JADX WARN: Code duplicated, block: B:106:0x0208  */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:112:0x0221 A[LOOP:0: B:107:0x020c->B:112:0x0221, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0228  */
    /* JADX WARN: Code duplicated, block: B:116:0x022c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0237  */
    /* JADX WARN: Code duplicated, block: B:120:0x023d A[PHI: r2 r3
      0x023d: PHI (r2v141 boolean) = (r2v127 boolean), (r2v128 boolean) binds: [B:119:0x023b, B:571:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r3v126 java.util.ArrayList) = (r3v117 java.util.ArrayList), (r3v118 java.util.ArrayList) binds: [B:119:0x023b, B:571:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0242  */
    /* JADX WARN: Code duplicated, block: B:124:0x024c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:152:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:177:0x030e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0318  */
    /* JADX WARN: Code duplicated, block: B:183:0x0322  */
    /* JADX WARN: Code duplicated, block: B:189:0x034d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0361  */
    /* JADX WARN: Code duplicated, block: B:197:0x0367  */
    /* JADX WARN: Code duplicated, block: B:198:0x0373  */
    /* JADX WARN: Code duplicated, block: B:200:0x0377  */
    /* JADX WARN: Code duplicated, block: B:201:0x0382  */
    /* JADX WARN: Code duplicated, block: B:202:0x0387 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0389  */
    /* JADX WARN: Code duplicated, block: B:205:0x0391  */
    /* JADX WARN: Code duplicated, block: B:206:0x0394  */
    /* JADX WARN: Code duplicated, block: B:209:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:221:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:234:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:237:0x040e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0412  */
    /* JADX WARN: Code duplicated, block: B:240:0x041b  */
    /* JADX WARN: Code duplicated, block: B:242:0x041f  */
    /* JADX WARN: Code duplicated, block: B:243:0x042d A[PHI: r1
      0x042d: PHI (r1v76 double) = (r1v75 double), (r1v89 double), (r1v90 double) binds: [B:235:0x040b, B:242:0x041f, B:239:0x0412] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x043a  */
    /* JADX WARN: Code duplicated, block: B:248:0x043e  */
    /* JADX WARN: Code duplicated, block: B:250:0x044e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0451  */
    /* JADX WARN: Code duplicated, block: B:253:0x0458  */
    /* JADX WARN: Code duplicated, block: B:254:0x045d  */
    /* JADX WARN: Code duplicated, block: B:258:0x046e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0472  */
    /* JADX WARN: Code duplicated, block: B:261:0x047f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0484  */
    /* JADX WARN: Code duplicated, block: B:263:0x0489  */
    /* JADX WARN: Code duplicated, block: B:267:0x0496  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:270:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:272:0x04af  */
    /* JADX WARN: Code duplicated, block: B:274:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:276:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:282:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:284:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:286:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:287:0x04eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:410:0x0853  */
    /* JADX WARN: Code duplicated, block: B:459:0x098e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:545:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x03f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[LOOP:3: B:181:0x031c->B:559:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX WARN: Code duplicated, block: B:568:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x03b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:596:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:83:0x019a  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ec  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoSuchAlgorithmException, KeyManagementException {
        ou80 ou80Var;
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        czo1 czo1Var;
        tqe0 tqe0VarB;
        w7h1 w7h1Var4;
        String str2;
        Object obj4;
        Object ivzVar;
        int iC;
        f79 f79Var;
        double d;
        Collection collectionK;
        Iterator it;
        int iNextInt;
        Collection collectionQ;
        Iterator it2;
        Iterator it3;
        z69 z69Var;
        c79 c79Var;
        ArrayList arrayList;
        int i;
        c79 c79Var2;
        b79 b79Var;
        b79 b79Var2;
        Iterator it4;
        double d2;
        b79 b79Var3;
        c79 c79Var3;
        double d3;
        b79 b79Var4;
        ArrayList arrayList2;
        double d4;
        boolean z;
        ArrayList arrayList3;
        Iterator it5;
        double d5;
        boolean z2;
        ArrayList arrayList4;
        w69 w69Var;
        double d6;
        double d7;
        boolean z3;
        ArrayList arrayList5;
        List listW1;
        Iterator it6;
        mmr0 mmr0Var;
        double dN;
        Iterator it7;
        Object next;
        z69 z69Var2;
        Iterator it8;
        int i2;
        Object next2;
        x69 x69Var;
        double dPow;
        w69 w69Var2;
        Double dValueOf;
        double dDoubleValue;
        double d8;
        double d9;
        int iC2;
        double dPow2;
        Double dValueOf2;
        hvz hvzVar;
        int i3;
        double d10;
        o69 o69Var;
        double dLog10;
        Double dValueOf3;
        f79 f79Var2;
        double d11;
        Iterator it9;
        String str3 = "";
        switch (this.a) {
            case 0:
                ((mh2) ((lyc) this).receiver).g.onNext(new qh2(new ai2(((Number) obj3).intValue(), ((Number) obj2).intValue(), ((Number) obj).intValue())));
                return rih1.a;
            case 1:
                tv80 tv80Var = (tv80) obj2;
                lnm lnmVar = (lnm) obj3;
                bb3 bb3Var = (bb3) ((lyc) this).receiver;
                aas aasVar = bb3Var.b;
                List listSingletonList = Collections.singletonList(ContextTrack.create(((uv11) obj).a));
                y6r0 y6r0Var = bb3Var.c.get();
                String str4 = y6r0Var != null ? y6r0Var.a : null;
                if (str4 == null) {
                    str4 = "";
                }
                if (tv80Var != null && (ou80Var = tv80Var.a) != null && (str = ou80Var.a) != null) {
                    str3 = str;
                }
                Object objI = fc11.i(aasVar.a(2, str4, str3, listSingletonList).o(Functions.h), lnmVar);
                return objI == d9n.a ? objI : rih1.a;
            case 2:
                return ((bb3) ((lyc) this).receiver).d((uv11) obj, (tv80) obj2, (lnm) obj3);
            case 3:
                return (t6g1) ((w6g1) ((lyc) this).receiver).a((String) obj, (String) obj2, (ioj0) obj3);
            case 4:
                apd apdVar = (apd) obj;
                int iIntValue = ((Number) obj2).intValue();
                ouk0 ouk0Var = (ouk0) obj3;
                qpy qpyVar = (qpy) ((lyc) this).receiver;
                b7x b7xVar = b7x.a;
                MobiusLoop mobiusLoop = qpyVar.Z0;
                if (mobiusLoop == null) {
                    u890.C("mobiusLoop");
                    throw null;
                }
                dny dnyVar = (dny) mobiusLoop.i;
                if (apdVar.e) {
                    dnyVar = null;
                } else {
                    if ((dnyVar != null ? dnyVar.j : null) == null) {
                        dnyVar = null;
                    }
                }
                j80 j80Var = apdVar.d;
                if (j80Var instanceof j80) {
                    j80 j80Var2 = j80Var;
                    String str5 = j80Var2.b;
                    if (str5 == null) {
                        str5 = j80Var2.a;
                    }
                    String str6 = str5;
                    if (dnyVar != null) {
                        jpk0 jpk0VarJ = qpyVar.j(dnyVar, str6);
                        if (jpk0VarJ == null) {
                            w7h1Var3 = null;
                        } else {
                            py9 py9Var = jpk0VarJ.c;
                            if (j80Var2.b == null && dnyVar.h) {
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str6 != null ? str6 : "")), jpk0VarJ.b, py9Var.b, System.currentTimeMillis());
                            } else {
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6 != null ? str6 : "")), jpk0VarJ.b, py9Var.b, System.currentTimeMillis());
                            }
                        }
                    } else {
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        x6h1 x6h1VarC = ouk0Var.b.c();
                        x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, str6, (String) null));
                        x6h1VarC.j = true;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6 != null ? str6 : "")), x6h1VarC.a(), ouk0Var.a, System.currentTimeMillis());
                    }
                    w7h1 w7h1Var5 = w7h1Var3;
                    if (w7h1Var5 != null) {
                        tv80 tv80VarM = qpyVar.T0.m(w7h1Var5, (xj61) null);
                        qpyVar.U0.a(w7h1Var5, tv80VarM.a);
                        MobiusLoop mobiusLoop2 = qpyVar.Z0;
                        if (mobiusLoop2 == null) {
                            u890.C("mobiusLoop");
                            throw null;
                        }
                        mym.l(mobiusLoop2, new tfy(j80Var2, qpyVar.R0, tv80VarM));
                    }
                } else if (j80Var instanceof k80) {
                    if (dnyVar != null) {
                        k80 k80Var = (k80) j80Var;
                        jpk0 jpk0VarJ2 = qpyVar.j(dnyVar, k80Var.a);
                        if (jpk0VarJ2 != null) {
                            String str7 = k80Var.a;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str7 != null ? str7 : "")), jpk0VarJ2.b, jpk0VarJ2.c.b, System.currentTimeMillis());
                        } else {
                            w7h1Var2 = null;
                        }
                    } else {
                        py9 py9VarI = qpyVar.i();
                        if (py9VarI != null) {
                            x6h1 x6h1VarC2 = py9VarI.c.c();
                            x6h1VarC2.i.add(new a7h1("shuffle_play_item", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            y6h1 y6h1VarA = x6h1VarC2.a();
                            String str8 = ((k80) j80Var).a;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str8 != null ? str8 : "")), y6h1VarA, py9VarI.b, System.currentTimeMillis());
                        } else {
                            w7h1Var2 = null;
                        }
                    }
                    if (w7h1Var2 != null) {
                        tv80 tv80VarM2 = qpyVar.T0.m(w7h1Var2, (xj61) null);
                        qpyVar.U0.a(w7h1Var2, tv80VarM2.a);
                        MobiusLoop mobiusLoop3 = qpyVar.Z0;
                        if (mobiusLoop3 == null) {
                            u890.C("mobiusLoop");
                            throw null;
                        }
                        mym.l(mobiusLoop3, new vfy((k80) j80Var, qpyVar.R0, tv80VarM2));
                    }
                } else if (j80Var instanceof g80) {
                    g80 g80Var = (g80) j80Var;
                    String uri = g80Var.a.getUri();
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    x6h1 x6h1VarC3 = ouk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("item", (String) null, numValueOf2, uri, (String) null));
                    x6h1VarC3.j = true;
                    w7h1 w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri != null ? uri : "")), x6h1VarC3.a(), ouk0Var.a, System.currentTimeMillis());
                    ou80 ou80Var2 = qpyVar.T0.m(w7h1Var6, (xj61) null).a;
                    qpyVar.U0.a(w7h1Var6, ou80Var2);
                    MobiusLoop mobiusLoop4 = qpyVar.Z0;
                    if (mobiusLoop4 == null) {
                        u890.C("mobiusLoop");
                        throw null;
                    }
                    mym.l(mobiusLoop4, new lfy(g80Var, ou80Var2));
                } else if (j80Var instanceof i80) {
                    if (dnyVar != null) {
                        i80 i80Var = (i80) j80Var;
                        jpk0 jpk0VarJ3 = qpyVar.j(dnyVar, i80Var.a);
                        if (jpk0VarJ3 != null) {
                            String str9 = i80Var.a;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str9 != null ? str9 : "")), jpk0VarJ3.b, jpk0VarJ3.c.b, System.currentTimeMillis());
                        } else {
                            w7h1Var = null;
                        }
                    } else {
                        Integer numValueOf3 = Integer.valueOf(iIntValue);
                        i80 i80Var2 = (i80) j80Var;
                        String str10 = i80Var2.a;
                        x6h1 x6h1VarC4 = ouk0Var.b.c();
                        x6h1VarC4.i.add(new a7h1("item", (String) null, numValueOf3, str10, (String) null));
                        x6h1VarC4.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC4.a();
                        String str11 = i80Var2.a;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str11 != null ? str11 : "")), y6h1VarA2, ouk0Var.a, System.currentTimeMillis());
                    }
                    if (w7h1Var != null) {
                        tv80 tv80VarM3 = qpyVar.T0.m(w7h1Var, (xj61) null);
                        qpyVar.U0.a(w7h1Var, tv80VarM3.a);
                        MobiusLoop mobiusLoop5 = qpyVar.Z0;
                        if (mobiusLoop5 == null) {
                            u890.C("mobiusLoop");
                            throw null;
                        }
                        mym.l(mobiusLoop5, new sfy((i80) j80Var, tv80VarM3));
                    }
                } else if (!(j80Var instanceof o80) && !(j80Var instanceof m80) && !(j80Var instanceof l80)) {
                    eg.o();
                    return null;
                }
                return rih1.a;
            case 5:
                return ((e8z) ((lyc) this).receiver).d((uv11) obj, (tv80) obj2, (lnm) obj3);
            case 6:
                e8z e8zVar = (e8z) ((lyc) this).receiver;
                Object objY = fn31.Y(e8zVar.d, new piu(e8zVar, (uv11) obj, (tv80) obj2, (lnm) null, (byte) 10), (lnm) obj3);
                return objY == d9n.a ? objY : rih1.a;
            case 7:
                return (t6g1) ((w6g1) ((lyc) this).receiver).a((String) obj, (String) obj2, (ioj0) obj3);
            case 8:
                xoe0 xoe0Var = (xoe0) obj;
                are0 are0Var = (are0) obj2;
                qqe0 qqe0Var = (qqe0) obj3;
                ((uqe0) ((lyc) this).receiver).getClass();
                if (!(qqe0Var instanceof jqe0)) {
                    if (qqe0Var instanceof iqe0) {
                        czo1Var = ((iqe0) qqe0Var).a;
                    }
                    return null;
                }
                czo1Var = k50.c;
                joe0 joe0Var = (moe0) are0Var.c.get(czo1Var);
                if (joe0Var != null && (tqe0VarB = uqe0.b(xoe0Var.a, are0Var, czo1Var)) != null) {
                    iu30 iu30Var = tqe0VarB.b;
                    Function0 function0 = tqe0VarB.c;
                    if (joe0Var instanceof joe0) {
                        if (iu30Var != null) {
                            fyn0 fyn0Var = joe0Var.a;
                            if (fyn0Var instanceof fyn0) {
                                str2 = fyn0Var.c;
                            } else if (fyn0Var instanceof gyn0) {
                                str2 = ((gyn0) fyn0Var).c;
                            } else {
                                eg.o();
                            }
                            return (w7h1) iu30Var.invoke(str2);
                        }
                    } else if (joe0Var instanceof goe0) {
                        if (function0 != null) {
                            return (w7h1) function0.invoke();
                        }
                    } else if (joe0Var instanceof foe0) {
                        Function0 function1 = tqe0VarB.e;
                        if (function1 != null && (w7h1Var4 = (w7h1) function1.invoke()) != null) {
                            return w7h1Var4;
                        }
                        if (function0 != null) {
                            return (w7h1) function0.invoke();
                        }
                    } else if ((joe0Var instanceof loe0) || (joe0Var instanceof koe0)) {
                        Function0 function2 = tqe0VarB.d;
                        if (function2 != null) {
                            return (w7h1) function2.invoke();
                        }
                    } else if (joe0Var instanceof eoe0) {
                        if (iu30Var != null) {
                            return (w7h1) iu30Var.invoke((Object) null);
                        }
                    } else if (joe0Var instanceof hoe0) {
                        if (function0 != null) {
                            return (w7h1) function0.invoke();
                        }
                    } else if (!(joe0Var instanceof ioe0)) {
                        eg.o();
                    }
                }
                return null;
            case 9:
                Intent intent = (Intent) obj;
                k4v0 k4v0Var = (k4v0) ((lyc) this).receiver;
                k4v0Var.getClass();
                return k4v0Var.g(intent, new m53(k4v0Var, intent, (th61) obj2, (lnm) null), (lnm) obj3);
            case 10:
                Intent intent2 = (Intent) obj;
                k4v0 k4v0Var2 = (k4v0) ((lyc) this).receiver;
                k4v0Var2.getClass();
                return k4v0Var2.g(intent2, new n93(k4v0Var2, intent2, (th61) obj2, (lnm) null, (byte) 4), (lnm) obj3);
            case 11:
                Intent intent3 = (Intent) obj;
                k4v0 k4v0Var3 = (k4v0) ((lyc) this).receiver;
                k4v0Var3.getClass();
                return k4v0Var3.g(intent3, new n93(k4v0Var3, intent3, (th61) obj2, (lnm) null, (byte) 4), (lnm) obj3);
            case 12:
                Intent intent4 = (Intent) obj;
                k4v0 k4v0Var4 = (k4v0) ((lyc) this).receiver;
                k4v0Var4.getClass();
                return k4v0Var4.g(intent4, new n93(k4v0Var4, intent4, (th61) obj2, (lnm) null, (byte) 4), (lnm) obj3);
            case 13:
                Intent intent5 = (Intent) obj;
                k4v0 k4v0Var5 = (k4v0) ((lyc) this).receiver;
                k4v0Var5.getClass();
                return k4v0Var5.g(intent5, new n93(k4v0Var5, intent5, (th61) obj2, (lnm) null, (byte) 4), (lnm) obj3);
            case 14:
                Intent intent6 = (Intent) obj;
                k4v0 k4v0Var6 = (k4v0) ((lyc) this).receiver;
                k4v0Var6.getClass();
                return k4v0Var6.g(intent6, new n93(k4v0Var6, intent6, (th61) obj2, (lnm) null, (byte) 4), (lnm) obj3);
            case 15:
                int iIntValue2 = ((Number) obj2).intValue();
                zok0 zok0Var = ((p3w0) ((lyc) this).receiver).b;
                x6h1 x6h1VarC5 = zok0Var.b.c();
                x6h1VarC5.i.add(new a7h1("video_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA3 = x6h1VarC5.a();
                Integer numValueOf4 = Integer.valueOf(iIntValue2);
                x6h1 x6h1VarC6 = y6h1VarA3.c();
                x6h1VarC6.i.add(new a7h1("video_card", (String) obj, numValueOf4, (String) obj3, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA4 = x6h1VarC6.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA4;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = zok0Var.c;
                return k7h1Var.a();
            case 16:
                return (t6g1) ((w6g1) ((lyc) this).receiver).a((String) obj, (String) obj2, (ioj0) obj3);
            case 17:
                return (t6g1) ((w6g1) ((lyc) this).receiver).a((String) obj, (String) obj2, (ioj0) obj3);
            case 18:
                return (t6g1) ((w6g1) ((lyc) this).receiver).a((String) obj, (String) obj2, (ioj0) obj3);
            case 19:
                return (t6g1) ((w6g1) ((lyc) this).receiver).a((String) obj, (String) obj2, (ioj0) obj3);
            case 20:
                oba1 oba1Var = (oba1) obj;
                nba1 nba1Var = (nba1) obj2;
                tqw tqwVar = (tqw) obj3;
                qba1 qba1Var = (qba1) ((lyc) this).receiver;
                qba1Var.getClass();
                if (nba1Var.equals(mba1.a)) {
                    qba1Var.b.invoke(oba1Var.a.a, tqwVar != null ? n3o1.y(tqwVar) : null);
                } else {
                    if (!nba1Var.equals(lba1.a)) {
                        eg.o();
                        return null;
                    }
                    iu30 iu30Var2 = qba1Var.a;
                    if (iu30Var2 != null) {
                        iu30Var2.invoke(tqwVar != null ? n3o1.y(tqwVar) : null);
                    }
                }
                return rih1.a;
            case 21:
                int iIntValue3 = ((Number) obj3).intValue();
                ((sye1) ((lyc) this).receiver).getClass();
                TrustManager a85Var = new a85((byte) 1);
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{a85Var}, new SecureRandom());
                return (SSLSocket) sSLContext.getSocketFactory().createSocket((Socket) obj, (String) obj2, iIntValue3, true);
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                s69 s69Var = (s69) obj2;
                i79 i79Var = (i79) obj3;
                r69 r69Var = (r69) ((lyc) this).receiver;
                r69Var.getClass();
                int i4 = i79Var.b;
                t69 t69Var = t69.a;
                double d12 = s69Var.c;
                double d13 = s69Var.b;
                h79 h79Var = i79Var.c;
                ArrayList arrayList6 = i79Var.d;
                if (Math.abs(dDoubleValue2) <= Double.MAX_VALUE && Math.abs(d13) <= Double.MAX_VALUE && Math.abs(d12) <= Double.MAX_VALUE && d13 < d12) {
                    if (arrayList6.isEmpty()) {
                        d = 0.0d;
                        obj4 = null;
                        collectionK = p7h.K(arrayList6);
                        if ((collectionK instanceof Collection) || !collectionK.isEmpty()) {
                            it = collectionK.iterator();
                            while (true) {
                                if (((sr80) it).c) {
                                    iNextInt = ((lr80) it).nextInt();
                                    collectionQ = yoi1.Q(iNextInt + 1, arrayList6.size());
                                    if ((collectionQ instanceof Collection) || !collectionQ.isEmpty()) {
                                        it2 = collectionQ.iterator();
                                        while (true) {
                                            if (((sr80) it2).c) {
                                                int iNextInt2 = ((lr80) it2).nextInt();
                                                it3 = it;
                                                z69 z69Var3 = (z69) arrayList6.get(iNextInt);
                                                z69Var = (z69) arrayList6.get(iNextInt2);
                                                c79Var = z69Var3.a;
                                                arrayList = arrayList6;
                                                if (c79Var instanceof a79) {
                                                    c79Var3 = z69Var.a;
                                                    if (c79Var3 instanceof a79) {
                                                        i = iNextInt;
                                                        if (((a79) c79Var).a == ((a79) c79Var3).a) {
                                                        }
                                                        it4 = it2;
                                                        it = it3;
                                                        iNextInt = i;
                                                        it2 = it4;
                                                        arrayList6 = arrayList;
                                                        dDoubleValue2 = dDoubleValue2;
                                                    } else {
                                                        i = iNextInt;
                                                        if (c79Var3 instanceof b79) {
                                                            d3 = ((a79) c79Var).a;
                                                            b79Var4 = (b79) c79Var3;
                                                            if (d3 > b79Var4.a && d3 < b79Var4.b) {
                                                            }
                                                            it4 = it2;
                                                            it = it3;
                                                            iNextInt = i;
                                                            it2 = it4;
                                                            arrayList6 = arrayList;
                                                            dDoubleValue2 = dDoubleValue2;
                                                        } else {
                                                            eg.o();
                                                        }
                                                    }
                                                } else {
                                                    i = iNextInt;
                                                    if (c79Var instanceof b79) {
                                                        c79Var2 = z69Var.a;
                                                        if (c79Var2 instanceof a79) {
                                                            d2 = ((a79) c79Var2).a;
                                                            b79Var3 = (b79) c79Var;
                                                            if (d2 > b79Var3.a && d2 < b79Var3.b) {
                                                            }
                                                            it4 = it2;
                                                            it = it3;
                                                            iNextInt = i;
                                                            it2 = it4;
                                                            arrayList6 = arrayList;
                                                            dDoubleValue2 = dDoubleValue2;
                                                        } else if (c79Var2 instanceof b79) {
                                                            b79Var = (b79) c79Var;
                                                            b79Var2 = (b79) c79Var2;
                                                            it4 = it2;
                                                            if (Math.max(b79Var.a, b79Var2.a) >= Math.min(b79Var.b, b79Var2.b)) {
                                                                it = it3;
                                                                iNextInt = i;
                                                                it2 = it4;
                                                                arrayList6 = arrayList;
                                                                dDoubleValue2 = dDoubleValue2;
                                                            }
                                                        } else {
                                                            eg.o();
                                                        }
                                                    } else {
                                                        eg.o();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    it = it;
                                    arrayList6 = arrayList6;
                                    dDoubleValue2 = dDoubleValue2;
                                } else {
                                    arrayList2 = arrayList6;
                                    d4 = dDoubleValue2;
                                    z = h79Var instanceof o69;
                                    if (z) {
                                        o69 o69Var2 = (o69) h79Var;
                                        d11 = o69Var2.a;
                                        if (Math.abs(d11) <= Double.MAX_VALUE && d11 > 0.0d && Math.abs(o69Var2.b) <= Double.MAX_VALUE && d13 >= 0.0d) {
                                            if (d13 <= 0.0d) {
                                                if (!arrayList2.isEmpty()) {
                                                    it9 = arrayList2.iterator();
                                                    while (true) {
                                                        if (!it9.hasNext()) {
                                                            if (g0p1.A((z69) it9.next(), d)) {
                                                                d = 0.0d;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z3 = z;
                                            dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                            it7 = arrayList2.iterator();
                                            do {
                                                if (it7.hasNext()) {
                                                    next = it7.next();
                                                } else {
                                                    next = null;
                                                }
                                                z69Var2 = (z69) next;
                                                if (z69Var2 != null) {
                                                    f79Var2 = z69Var2.b;
                                                    if (f79Var2 instanceof d79) {
                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                    } else if (f79Var2 instanceof e79) {
                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                    } else {
                                                        eg.o();
                                                    }
                                                    if (ivzVar instanceof hvz) {
                                                        hvz hvzVar2 = (hvz) ivzVar;
                                                        return r69Var.a(hvzVar2.a, i4, hvzVar2.b);
                                                    }
                                                    if (ivzVar instanceof ivz) {
                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                        if (iC != 0) {
                                                            if (iC != 1) {
                                                                if (iC != 2 || iC == 3) {
                                                                    Resources resources = r69Var.a;
                                                                    return resources.getString(2131958634, resources.getString(2131958641));
                                                                }
                                                                eg.o();
                                                            } else if (i4 != 2 || i4 == 3) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (i4 == 2) {
                                                            return r69Var.a(0.0d, i4, 1);
                                                        }
                                                    } else if (ivzVar != null) {
                                                        eg.o();
                                                    }
                                                } else if (z3) {
                                                    o69Var = (o69) h79Var;
                                                    if (dN <= 0.0d) {
                                                        dValueOf3 = null;
                                                    } else {
                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                        dValueOf3 = Double.valueOf(dLog10);
                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                            dValueOf3 = null;
                                                        }
                                                    }
                                                    if (dValueOf3 != null) {
                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                        ivzVar = hvzVar;
                                                    }
                                                    if (ivzVar instanceof hvz) {
                                                        hvz hvzVar3 = (hvz) ivzVar;
                                                        return r69Var.a(hvzVar3.a, i4, hvzVar3.b);
                                                    }
                                                    if (ivzVar instanceof ivz) {
                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                        if (iC != 0) {
                                                            if (iC != 1) {
                                                                if (i4 != 2) {
                                                                }
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                            if (iC != 2) {
                                                            }
                                                            Resources resources2 = r69Var.a;
                                                            return resources2.getString(2131958634, resources2.getString(2131958641));
                                                        }
                                                        if (i4 == 2) {
                                                            return r69Var.a(0.0d, i4, 1);
                                                        }
                                                    } else if (ivzVar != null) {
                                                        eg.o();
                                                    }
                                                } else if (h79Var instanceof y69) {
                                                    ArrayList arrayList7 = ((y69) h79Var).a;
                                                    it8 = arrayList7.iterator();
                                                    i2 = 0;
                                                    while (true) {
                                                        if (it8.hasNext()) {
                                                            next2 = it8.next();
                                                            i3 = i2 + 1;
                                                            if (i2 >= 0) {
                                                                p7h.T();
                                                                throw null;
                                                            }
                                                            x69 x69Var2 = (x69) next2;
                                                            d10 = x69Var2.a;
                                                            double d14 = x69Var2.b;
                                                            if (dN >= d10 || (dN >= d14 && (i2 != p7h.L(arrayList7) || dN > d14))) {
                                                                i2 = i3;
                                                            }
                                                        } else {
                                                            next2 = null;
                                                        }
                                                    }
                                                    x69Var = (x69) next2;
                                                    if (x69Var != null) {
                                                        double d15 = x69Var.a;
                                                        dPow = (dN - d15) / (x69Var.b - d15);
                                                        w69Var2 = x69Var.f;
                                                        if (u890.j(w69Var2, t69Var)) {
                                                            dValueOf = Double.valueOf(dPow);
                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                dValueOf = null;
                                                            }
                                                            if (dValueOf != null) {
                                                                dDoubleValue = dValueOf.doubleValue();
                                                                int i5 = x69Var.e;
                                                                d8 = x69Var.d;
                                                                d9 = x69Var.c;
                                                                iC2 = l1d.C(i5);
                                                                if (iC2 != 0) {
                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                } else if (iC2 == 1) {
                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                    dValueOf2 = null;
                                                                }
                                                                if (dValueOf2 != null) {
                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                    ivzVar = hvzVar;
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar4 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar4.a, i4, hvzVar4.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources3 = r69Var.a;
                                                                        return resources3.getString(2131958634, resources3.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            }
                                                        } else {
                                                            if (w69Var2 instanceof u69) {
                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                            } else if (w69Var2 instanceof v69) {
                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                            } else {
                                                                eg.o();
                                                            }
                                                            dValueOf = Double.valueOf(dPow);
                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                dValueOf = null;
                                                            }
                                                            if (dValueOf != null) {
                                                                dDoubleValue = dValueOf.doubleValue();
                                                                int i6 = x69Var.e;
                                                                d8 = x69Var.d;
                                                                d9 = x69Var.c;
                                                                iC2 = l1d.C(i6);
                                                                if (iC2 != 0) {
                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                } else if (iC2 == 1) {
                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                    dValueOf2 = null;
                                                                }
                                                                if (dValueOf2 != null) {
                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                    ivzVar = hvzVar;
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar5 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar5.a, i4, hvzVar5.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources4 = r69Var.a;
                                                                        return resources4.getString(2131958634, resources4.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    eg.o();
                                                }
                                            } while (!g0p1.A((z69) next, dN));
                                            z69Var2 = (z69) next;
                                            if (z69Var2 != null) {
                                                f79Var2 = z69Var2.b;
                                                if (f79Var2 instanceof d79) {
                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                } else if (f79Var2 instanceof e79) {
                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                } else {
                                                    eg.o();
                                                }
                                                if (ivzVar instanceof hvz) {
                                                    hvz hvzVar6 = (hvz) ivzVar;
                                                    return r69Var.a(hvzVar6.a, i4, hvzVar6.b);
                                                }
                                                if (ivzVar instanceof ivz) {
                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                    if (iC != 0) {
                                                        if (iC != 1) {
                                                            if (i4 != 2) {
                                                            }
                                                            return r69Var.a(0.0d, i4, 1);
                                                        }
                                                        if (iC != 2) {
                                                        }
                                                        Resources resources5 = r69Var.a;
                                                        return resources5.getString(2131958634, resources5.getString(2131958641));
                                                    }
                                                    if (i4 == 2) {
                                                        return r69Var.a(0.0d, i4, 1);
                                                    }
                                                } else if (ivzVar != null) {
                                                    eg.o();
                                                }
                                            } else if (z3) {
                                                o69Var = (o69) h79Var;
                                                if (dN <= 0.0d) {
                                                    dValueOf3 = null;
                                                } else {
                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                    dValueOf3 = Double.valueOf(dLog10);
                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                        dValueOf3 = null;
                                                    }
                                                }
                                                if (dValueOf3 != null) {
                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                    ivzVar = hvzVar;
                                                }
                                                if (ivzVar instanceof hvz) {
                                                    hvz hvzVar7 = (hvz) ivzVar;
                                                    return r69Var.a(hvzVar7.a, i4, hvzVar7.b);
                                                }
                                                if (ivzVar instanceof ivz) {
                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                    if (iC != 0) {
                                                        if (iC != 1) {
                                                            if (i4 != 2) {
                                                            }
                                                            return r69Var.a(0.0d, i4, 1);
                                                        }
                                                        if (iC != 2) {
                                                        }
                                                        Resources resources6 = r69Var.a;
                                                        return resources6.getString(2131958634, resources6.getString(2131958641));
                                                    }
                                                    if (i4 == 2) {
                                                        return r69Var.a(0.0d, i4, 1);
                                                    }
                                                } else if (ivzVar != null) {
                                                    eg.o();
                                                }
                                            } else if (h79Var instanceof y69) {
                                                ArrayList arrayList8 = ((y69) h79Var).a;
                                                it8 = arrayList8.iterator();
                                                i2 = 0;
                                                while (true) {
                                                    if (it8.hasNext()) {
                                                        next2 = it8.next();
                                                        i3 = i2 + 1;
                                                        if (i2 >= 0) {
                                                            p7h.T();
                                                            throw null;
                                                        }
                                                        x69 x69Var3 = (x69) next2;
                                                        d10 = x69Var3.a;
                                                        double d16 = x69Var3.b;
                                                        if (dN >= d10) {
                                                        }
                                                        i2 = i3;
                                                    } else {
                                                        next2 = null;
                                                    }
                                                }
                                                x69Var = (x69) next2;
                                                if (x69Var != null) {
                                                    double d17 = x69Var.a;
                                                    dPow = (dN - d17) / (x69Var.b - d17);
                                                    w69Var2 = x69Var.f;
                                                    if (u890.j(w69Var2, t69Var)) {
                                                        if (w69Var2 instanceof u69) {
                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                        } else if (w69Var2 instanceof v69) {
                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                        } else {
                                                            eg.o();
                                                        }
                                                        dValueOf = Double.valueOf(dPow);
                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                            dValueOf = null;
                                                        }
                                                        if (dValueOf != null) {
                                                            dDoubleValue = dValueOf.doubleValue();
                                                            int i7 = x69Var.e;
                                                            d8 = x69Var.d;
                                                            d9 = x69Var.c;
                                                            iC2 = l1d.C(i7);
                                                            if (iC2 != 0) {
                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                            } else if (iC2 == 1) {
                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                            } else {
                                                                eg.o();
                                                            }
                                                            dValueOf2 = Double.valueOf(dPow2);
                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                dValueOf2 = null;
                                                            }
                                                            if (dValueOf2 != null) {
                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar8 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar8.a, i4, hvzVar8.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources7 = r69Var.a;
                                                                    return resources7.getString(2131958634, resources7.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        }
                                                    } else {
                                                        dValueOf = Double.valueOf(dPow);
                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                            dValueOf = null;
                                                        }
                                                        if (dValueOf != null) {
                                                            dDoubleValue = dValueOf.doubleValue();
                                                            int i8 = x69Var.e;
                                                            d8 = x69Var.d;
                                                            d9 = x69Var.c;
                                                            iC2 = l1d.C(i8);
                                                            if (iC2 != 0) {
                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                            } else if (iC2 == 1) {
                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                            } else {
                                                                eg.o();
                                                            }
                                                            dValueOf2 = Double.valueOf(dPow2);
                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                dValueOf2 = null;
                                                            }
                                                            if (dValueOf2 != null) {
                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar9 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar9.a, i4, hvzVar9.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources8 = r69Var.a;
                                                                    return resources8.getString(2131958634, resources8.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                eg.o();
                                            }
                                        }
                                    } else if (h79Var instanceof y69) {
                                        arrayList3 = ((y69) h79Var).a;
                                        if (!arrayList3.isEmpty()) {
                                            if (arrayList3.isEmpty()) {
                                                z3 = z;
                                                arrayList5 = arrayList3;
                                                if (((x69) o7h.q0(arrayList5)).a <= d13 && ((x69) o7h.A0(arrayList5)).b >= d12) {
                                                    listW1 = o7h.w1(arrayList5);
                                                    if ((listW1 instanceof Collection) || !listW1.isEmpty()) {
                                                        it6 = listW1.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                mmr0Var = (mmr0) it6.next();
                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                }
                                                            } else {
                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                it7 = arrayList2.iterator();
                                                                do {
                                                                    if (it7.hasNext()) {
                                                                        next = it7.next();
                                                                    } else {
                                                                        next = null;
                                                                    }
                                                                    z69Var2 = (z69) next;
                                                                    if (z69Var2 != null) {
                                                                        f79Var2 = z69Var2.b;
                                                                        if (f79Var2 instanceof d79) {
                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                        } else if (f79Var2 instanceof e79) {
                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar10 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar10.a, i4, hvzVar10.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources9 = r69Var.a;
                                                                                return resources9.getString(2131958634, resources9.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    } else if (z3) {
                                                                        o69Var = (o69) h79Var;
                                                                        if (dN <= 0.0d) {
                                                                            dValueOf3 = null;
                                                                        } else {
                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                dValueOf3 = null;
                                                                            }
                                                                        }
                                                                        if (dValueOf3 != null) {
                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar11 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar11.a, i4, hvzVar11.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources10 = r69Var.a;
                                                                                return resources10.getString(2131958634, resources10.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    } else if (h79Var instanceof y69) {
                                                                        ArrayList arrayList9 = ((y69) h79Var).a;
                                                                        it8 = arrayList9.iterator();
                                                                        i2 = 0;
                                                                        while (true) {
                                                                            if (it8.hasNext()) {
                                                                                next2 = it8.next();
                                                                                i3 = i2 + 1;
                                                                                if (i2 >= 0) {
                                                                                    p7h.T();
                                                                                    throw null;
                                                                                }
                                                                                x69 x69Var4 = (x69) next2;
                                                                                d10 = x69Var4.a;
                                                                                double d18 = x69Var4.b;
                                                                                if (dN >= d10) {
                                                                                }
                                                                                i2 = i3;
                                                                            } else {
                                                                                next2 = null;
                                                                            }
                                                                        }
                                                                        x69Var = (x69) next2;
                                                                        if (x69Var != null) {
                                                                            double d19 = x69Var.a;
                                                                            dPow = (dN - d19) / (x69Var.b - d19);
                                                                            w69Var2 = x69Var.f;
                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                if (w69Var2 instanceof u69) {
                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                } else if (w69Var2 instanceof v69) {
                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf = Double.valueOf(dPow);
                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                    dValueOf = null;
                                                                                }
                                                                                if (dValueOf != null) {
                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                    int i9 = x69Var.e;
                                                                                    d8 = x69Var.d;
                                                                                    d9 = x69Var.c;
                                                                                    iC2 = l1d.C(i9);
                                                                                    if (iC2 != 0) {
                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                    } else if (iC2 == 1) {
                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                        dValueOf2 = null;
                                                                                    }
                                                                                    if (dValueOf2 != null) {
                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar12 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar12.a, i4, hvzVar12.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources11 = r69Var.a;
                                                                                            return resources11.getString(2131958634, resources11.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                dValueOf = Double.valueOf(dPow);
                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                    dValueOf = null;
                                                                                }
                                                                                if (dValueOf != null) {
                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                    int i10 = x69Var.e;
                                                                                    d8 = x69Var.d;
                                                                                    d9 = x69Var.c;
                                                                                    iC2 = l1d.C(i10);
                                                                                    if (iC2 != 0) {
                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                    } else if (iC2 == 1) {
                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                        dValueOf2 = null;
                                                                                    }
                                                                                    if (dValueOf2 != null) {
                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar13 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar13.a, i4, hvzVar13.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources12 = r69Var.a;
                                                                                            return resources12.getString(2131958634, resources12.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                } while (!g0p1.A((z69) next, dN));
                                                                z69Var2 = (z69) next;
                                                                if (z69Var2 != null) {
                                                                    f79Var2 = z69Var2.b;
                                                                    if (f79Var2 instanceof d79) {
                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                    } else if (f79Var2 instanceof e79) {
                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar14 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar14.a, i4, hvzVar14.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources13 = r69Var.a;
                                                                            return resources13.getString(2131958634, resources13.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                } else if (z3) {
                                                                    o69Var = (o69) h79Var;
                                                                    if (dN <= 0.0d) {
                                                                        dValueOf3 = null;
                                                                    } else {
                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                            dValueOf3 = null;
                                                                        }
                                                                    }
                                                                    if (dValueOf3 != null) {
                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar15 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar15.a, i4, hvzVar15.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources14 = r69Var.a;
                                                                            return resources14.getString(2131958634, resources14.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                } else if (h79Var instanceof y69) {
                                                                    ArrayList arrayList10 = ((y69) h79Var).a;
                                                                    it8 = arrayList10.iterator();
                                                                    i2 = 0;
                                                                    while (true) {
                                                                        if (it8.hasNext()) {
                                                                            next2 = it8.next();
                                                                            i3 = i2 + 1;
                                                                            if (i2 >= 0) {
                                                                                p7h.T();
                                                                                throw null;
                                                                            }
                                                                            x69 x69Var5 = (x69) next2;
                                                                            d10 = x69Var5.a;
                                                                            double d110 = x69Var5.b;
                                                                            if (dN >= d10) {
                                                                            }
                                                                            i2 = i3;
                                                                        } else {
                                                                            next2 = null;
                                                                        }
                                                                    }
                                                                    x69Var = (x69) next2;
                                                                    if (x69Var != null) {
                                                                        double d111 = x69Var.a;
                                                                        dPow = (dN - d111) / (x69Var.b - d111);
                                                                        w69Var2 = x69Var.f;
                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                            if (w69Var2 instanceof u69) {
                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                            } else if (w69Var2 instanceof v69) {
                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf = Double.valueOf(dPow);
                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                dValueOf = null;
                                                                            }
                                                                            if (dValueOf != null) {
                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                int i11 = x69Var.e;
                                                                                d8 = x69Var.d;
                                                                                d9 = x69Var.c;
                                                                                iC2 = l1d.C(i11);
                                                                                if (iC2 != 0) {
                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                } else if (iC2 == 1) {
                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                    dValueOf2 = null;
                                                                                }
                                                                                if (dValueOf2 != null) {
                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar16 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar16.a, i4, hvzVar16.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources15 = r69Var.a;
                                                                                        return resources15.getString(2131958634, resources15.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            dValueOf = Double.valueOf(dPow);
                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                dValueOf = null;
                                                                            }
                                                                            if (dValueOf != null) {
                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                int i12 = x69Var.e;
                                                                                d8 = x69Var.d;
                                                                                d9 = x69Var.c;
                                                                                iC2 = l1d.C(i12);
                                                                                if (iC2 != 0) {
                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                } else if (iC2 == 1) {
                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                    dValueOf2 = null;
                                                                                }
                                                                                if (dValueOf2 != null) {
                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar17 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar17.a, i4, hvzVar17.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources16 = r69Var.a;
                                                                                        return resources16.getString(2131958634, resources16.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                        it7 = arrayList2.iterator();
                                                        do {
                                                            if (it7.hasNext()) {
                                                                next = it7.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            z69Var2 = (z69) next;
                                                            if (z69Var2 != null) {
                                                                f79Var2 = z69Var2.b;
                                                                if (f79Var2 instanceof d79) {
                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                } else if (f79Var2 instanceof e79) {
                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar18 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar18.a, i4, hvzVar18.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources17 = r69Var.a;
                                                                        return resources17.getString(2131958634, resources17.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            } else if (z3) {
                                                                o69Var = (o69) h79Var;
                                                                if (dN <= 0.0d) {
                                                                    dValueOf3 = null;
                                                                } else {
                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                        dValueOf3 = null;
                                                                    }
                                                                }
                                                                if (dValueOf3 != null) {
                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                    ivzVar = hvzVar;
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar19 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar19.a, i4, hvzVar19.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources18 = r69Var.a;
                                                                        return resources18.getString(2131958634, resources18.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            } else if (h79Var instanceof y69) {
                                                                ArrayList arrayList11 = ((y69) h79Var).a;
                                                                it8 = arrayList11.iterator();
                                                                i2 = 0;
                                                                while (true) {
                                                                    if (it8.hasNext()) {
                                                                        next2 = it8.next();
                                                                        i3 = i2 + 1;
                                                                        if (i2 >= 0) {
                                                                            p7h.T();
                                                                            throw null;
                                                                        }
                                                                        x69 x69Var6 = (x69) next2;
                                                                        d10 = x69Var6.a;
                                                                        double d112 = x69Var6.b;
                                                                        if (dN >= d10) {
                                                                        }
                                                                        i2 = i3;
                                                                    } else {
                                                                        next2 = null;
                                                                    }
                                                                }
                                                                x69Var = (x69) next2;
                                                                if (x69Var != null) {
                                                                    double d113 = x69Var.a;
                                                                    dPow = (dN - d113) / (x69Var.b - d113);
                                                                    w69Var2 = x69Var.f;
                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                        if (w69Var2 instanceof u69) {
                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                        } else if (w69Var2 instanceof v69) {
                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf = Double.valueOf(dPow);
                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                            dValueOf = null;
                                                                        }
                                                                        if (dValueOf != null) {
                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                            int i13 = x69Var.e;
                                                                            d8 = x69Var.d;
                                                                            d9 = x69Var.c;
                                                                            iC2 = l1d.C(i13);
                                                                            if (iC2 != 0) {
                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                            } else if (iC2 == 1) {
                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                dValueOf2 = null;
                                                                            }
                                                                            if (dValueOf2 != null) {
                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar110 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar110.a, i4, hvzVar110.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources19 = r69Var.a;
                                                                                    return resources19.getString(2131958634, resources19.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        dValueOf = Double.valueOf(dPow);
                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                            dValueOf = null;
                                                                        }
                                                                        if (dValueOf != null) {
                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                            int i14 = x69Var.e;
                                                                            d8 = x69Var.d;
                                                                            d9 = x69Var.c;
                                                                            iC2 = l1d.C(i14);
                                                                            if (iC2 != 0) {
                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                            } else if (iC2 == 1) {
                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                dValueOf2 = null;
                                                                            }
                                                                            if (dValueOf2 != null) {
                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar111 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar111.a, i4, hvzVar111.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources110 = r69Var.a;
                                                                                    return resources110.getString(2131958634, resources110.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        } while (!g0p1.A((z69) next, dN));
                                                        z69Var2 = (z69) next;
                                                        if (z69Var2 != null) {
                                                            f79Var2 = z69Var2.b;
                                                            if (f79Var2 instanceof d79) {
                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                            } else if (f79Var2 instanceof e79) {
                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                            } else {
                                                                eg.o();
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar112 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar112.a, i4, hvzVar112.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources111 = r69Var.a;
                                                                    return resources111.getString(2131958634, resources111.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (z3) {
                                                            o69Var = (o69) h79Var;
                                                            if (dN <= 0.0d) {
                                                                dValueOf3 = null;
                                                            } else {
                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                    dValueOf3 = null;
                                                                }
                                                            }
                                                            if (dValueOf3 != null) {
                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar113 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar113.a, i4, hvzVar113.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources112 = r69Var.a;
                                                                    return resources112.getString(2131958634, resources112.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (h79Var instanceof y69) {
                                                            ArrayList arrayList12 = ((y69) h79Var).a;
                                                            it8 = arrayList12.iterator();
                                                            i2 = 0;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    next2 = it8.next();
                                                                    i3 = i2 + 1;
                                                                    if (i2 >= 0) {
                                                                        p7h.T();
                                                                        throw null;
                                                                    }
                                                                    x69 x69Var7 = (x69) next2;
                                                                    d10 = x69Var7.a;
                                                                    double d114 = x69Var7.b;
                                                                    if (dN >= d10) {
                                                                    }
                                                                    i2 = i3;
                                                                } else {
                                                                    next2 = null;
                                                                }
                                                            }
                                                            x69Var = (x69) next2;
                                                            if (x69Var != null) {
                                                                double d115 = x69Var.a;
                                                                dPow = (dN - d115) / (x69Var.b - d115);
                                                                w69Var2 = x69Var.f;
                                                                if (u890.j(w69Var2, t69Var)) {
                                                                    if (w69Var2 instanceof u69) {
                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                    } else if (w69Var2 instanceof v69) {
                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i15 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i15);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar114 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar114.a, i4, hvzVar114.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources113 = r69Var.a;
                                                                                return resources113.getString(2131958634, resources113.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                } else {
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i16 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i16);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar115 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar115.a, i4, hvzVar115.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources114 = r69Var.a;
                                                                                return resources114.getString(2131958634, resources114.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            eg.o();
                                                        }
                                                    }
                                                }
                                            } else {
                                                it5 = arrayList3.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        x69 x69Var8 = (x69) it5.next();
                                                        d5 = x69Var8.a;
                                                        z2 = z;
                                                        arrayList4 = arrayList3;
                                                        double d20 = x69Var8.c;
                                                        double d21 = x69Var8.b;
                                                        double d22 = x69Var8.d;
                                                        if (Math.abs(d5) > Double.MAX_VALUE && Math.abs(d21) <= Double.MAX_VALUE && Math.abs(d20) <= Double.MAX_VALUE && Math.abs(d22) <= Double.MAX_VALUE && x69Var8.a < d21) {
                                                            if (x69Var8.e != 2) {
                                                                w69Var = x69Var8.f;
                                                                if (!u890.j(w69Var, t69Var)) {
                                                                    if (w69Var instanceof u69) {
                                                                        d7 = ((u69) w69Var).a;
                                                                        if (Math.abs(d7) <= Double.MAX_VALUE || d7 <= 0.0d) {
                                                                        }
                                                                    } else if (w69Var instanceof v69) {
                                                                        d6 = ((v69) w69Var).a;
                                                                        if (Math.abs(d6) <= Double.MAX_VALUE || d6 <= 0.0d) {
                                                                        }
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar116 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar116.a, i4, hvzVar116.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources115 = r69Var.a;
                                                                            return resources115.getString(2131958634, resources115.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                }
                                                                z = z2;
                                                                arrayList3 = arrayList4;
                                                            } else if (d20 != 0.0d && d22 != 0.0d) {
                                                                if ((d20 < 0.0d ? (byte) -1 : (byte) 1) == (d22 >= 0.0d ? (byte) 1 : (byte) -1)) {
                                                                    w69Var = x69Var8.f;
                                                                    if (!u890.j(w69Var, t69Var)) {
                                                                        if (w69Var instanceof u69) {
                                                                            d7 = ((u69) w69Var).a;
                                                                            if (Math.abs(d7) <= Double.MAX_VALUE) {
                                                                            }
                                                                        } else if (w69Var instanceof v69) {
                                                                            d6 = ((v69) w69Var).a;
                                                                            if (Math.abs(d6) <= Double.MAX_VALUE) {
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar117 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar117.a, i4, hvzVar117.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources116 = r69Var.a;
                                                                                return resources116.getString(2131958634, resources116.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                    z = z2;
                                                                    arrayList3 = arrayList4;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        z3 = z;
                                                        arrayList5 = arrayList3;
                                                        if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                                            listW1 = o7h.w1(arrayList5);
                                                            if (listW1 instanceof Collection) {
                                                                it6 = listW1.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        mmr0Var = (mmr0) it6.next();
                                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                        }
                                                                    } else {
                                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                        it7 = arrayList2.iterator();
                                                                        do {
                                                                            if (it7.hasNext()) {
                                                                                next = it7.next();
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                            z69Var2 = (z69) next;
                                                                            if (z69Var2 != null) {
                                                                                f79Var2 = z69Var2.b;
                                                                                if (f79Var2 instanceof d79) {
                                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                } else if (f79Var2 instanceof e79) {
                                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar118 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar118.a, i4, hvzVar118.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources117 = r69Var.a;
                                                                                        return resources117.getString(2131958634, resources117.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (z3) {
                                                                                o69Var = (o69) h79Var;
                                                                                if (dN <= 0.0d) {
                                                                                    dValueOf3 = null;
                                                                                } else {
                                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                        dValueOf3 = null;
                                                                                    }
                                                                                }
                                                                                if (dValueOf3 != null) {
                                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar119 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar119.a, i4, hvzVar119.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources118 = r69Var.a;
                                                                                        return resources118.getString(2131958634, resources118.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (h79Var instanceof y69) {
                                                                                ArrayList arrayList13 = ((y69) h79Var).a;
                                                                                it8 = arrayList13.iterator();
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        next2 = it8.next();
                                                                                        i3 = i2 + 1;
                                                                                        if (i2 >= 0) {
                                                                                            p7h.T();
                                                                                            throw null;
                                                                                        }
                                                                                        x69 x69Var9 = (x69) next2;
                                                                                        d10 = x69Var9.a;
                                                                                        double d116 = x69Var9.b;
                                                                                        if (dN >= d10) {
                                                                                        }
                                                                                        i2 = i3;
                                                                                    } else {
                                                                                        next2 = null;
                                                                                    }
                                                                                }
                                                                                x69Var = (x69) next2;
                                                                                if (x69Var != null) {
                                                                                    double d117 = x69Var.a;
                                                                                    dPow = (dN - d117) / (x69Var.b - d117);
                                                                                    w69Var2 = x69Var.f;
                                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                                        if (w69Var2 instanceof u69) {
                                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                        } else if (w69Var2 instanceof v69) {
                                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i17 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i17);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar1110 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar1110.a, i4, hvzVar1110.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources119 = r69Var.a;
                                                                                                    return resources119.getString(2131958634, resources119.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i18 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i18);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar1111 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar1111.a, i4, hvzVar1111.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources1110 = r69Var.a;
                                                                                                    return resources1110.getString(2131958634, resources1110.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                        } while (!g0p1.A((z69) next, dN));
                                                                        z69Var2 = (z69) next;
                                                                        if (z69Var2 != null) {
                                                                            f79Var2 = z69Var2.b;
                                                                            if (f79Var2 instanceof d79) {
                                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                            } else if (f79Var2 instanceof e79) {
                                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar1112 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar1112.a, i4, hvzVar1112.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1111 = r69Var.a;
                                                                                    return resources1111.getString(2131958634, resources1111.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (z3) {
                                                                            o69Var = (o69) h79Var;
                                                                            if (dN <= 0.0d) {
                                                                                dValueOf3 = null;
                                                                            } else {
                                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                    dValueOf3 = null;
                                                                                }
                                                                            }
                                                                            if (dValueOf3 != null) {
                                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar1113 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar1113.a, i4, hvzVar1113.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1112 = r69Var.a;
                                                                                    return resources1112.getString(2131958634, resources1112.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (h79Var instanceof y69) {
                                                                            ArrayList arrayList14 = ((y69) h79Var).a;
                                                                            it8 = arrayList14.iterator();
                                                                            i2 = 0;
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    next2 = it8.next();
                                                                                    i3 = i2 + 1;
                                                                                    if (i2 >= 0) {
                                                                                        p7h.T();
                                                                                        throw null;
                                                                                    }
                                                                                    x69 x69Var10 = (x69) next2;
                                                                                    d10 = x69Var10.a;
                                                                                    double d118 = x69Var10.b;
                                                                                    if (dN >= d10) {
                                                                                    }
                                                                                    i2 = i3;
                                                                                } else {
                                                                                    next2 = null;
                                                                                }
                                                                            }
                                                                            x69Var = (x69) next2;
                                                                            if (x69Var != null) {
                                                                                double d119 = x69Var.a;
                                                                                dPow = (dN - d119) / (x69Var.b - d119);
                                                                                w69Var2 = x69Var.f;
                                                                                if (u890.j(w69Var2, t69Var)) {
                                                                                    if (w69Var2 instanceof u69) {
                                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                    } else if (w69Var2 instanceof v69) {
                                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i19 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i19);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1114 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1114.a, i4, hvzVar1114.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1113 = r69Var.a;
                                                                                                return resources1113.getString(2131958634, resources1113.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i110 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i110);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1115 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1115.a, i4, hvzVar1115.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1114 = r69Var.a;
                                                                                                return resources1114.getString(2131958634, resources1114.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                it6 = listW1.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        mmr0Var = (mmr0) it6.next();
                                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                        }
                                                                    } else {
                                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                        it7 = arrayList2.iterator();
                                                                        do {
                                                                            if (it7.hasNext()) {
                                                                                next = it7.next();
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                            z69Var2 = (z69) next;
                                                                            if (z69Var2 != null) {
                                                                                f79Var2 = z69Var2.b;
                                                                                if (f79Var2 instanceof d79) {
                                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                } else if (f79Var2 instanceof e79) {
                                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar1116 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar1116.a, i4, hvzVar1116.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources1115 = r69Var.a;
                                                                                        return resources1115.getString(2131958634, resources1115.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (z3) {
                                                                                o69Var = (o69) h79Var;
                                                                                if (dN <= 0.0d) {
                                                                                    dValueOf3 = null;
                                                                                } else {
                                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                        dValueOf3 = null;
                                                                                    }
                                                                                }
                                                                                if (dValueOf3 != null) {
                                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar1117 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar1117.a, i4, hvzVar1117.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources1116 = r69Var.a;
                                                                                        return resources1116.getString(2131958634, resources1116.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (h79Var instanceof y69) {
                                                                                ArrayList arrayList15 = ((y69) h79Var).a;
                                                                                it8 = arrayList15.iterator();
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        next2 = it8.next();
                                                                                        i3 = i2 + 1;
                                                                                        if (i2 >= 0) {
                                                                                            p7h.T();
                                                                                            throw null;
                                                                                        }
                                                                                        x69 x69Var11 = (x69) next2;
                                                                                        d10 = x69Var11.a;
                                                                                        double d1110 = x69Var11.b;
                                                                                        if (dN >= d10) {
                                                                                        }
                                                                                        i2 = i3;
                                                                                    } else {
                                                                                        next2 = null;
                                                                                    }
                                                                                }
                                                                                x69Var = (x69) next2;
                                                                                if (x69Var != null) {
                                                                                    double d1111 = x69Var.a;
                                                                                    dPow = (dN - d1111) / (x69Var.b - d1111);
                                                                                    w69Var2 = x69Var.f;
                                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                                        if (w69Var2 instanceof u69) {
                                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                        } else if (w69Var2 instanceof v69) {
                                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i111 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i111);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar1118 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar1118.a, i4, hvzVar1118.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources1117 = r69Var.a;
                                                                                                    return resources1117.getString(2131958634, resources1117.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i112 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i112);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar1119 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar1119.a, i4, hvzVar1119.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources1118 = r69Var.a;
                                                                                                    return resources1118.getString(2131958634, resources1118.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                        } while (!g0p1.A((z69) next, dN));
                                                                        z69Var2 = (z69) next;
                                                                        if (z69Var2 != null) {
                                                                            f79Var2 = z69Var2.b;
                                                                            if (f79Var2 instanceof d79) {
                                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                            } else if (f79Var2 instanceof e79) {
                                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar11110 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar11110.a, i4, hvzVar11110.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1119 = r69Var.a;
                                                                                    return resources1119.getString(2131958634, resources1119.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (z3) {
                                                                            o69Var = (o69) h79Var;
                                                                            if (dN <= 0.0d) {
                                                                                dValueOf3 = null;
                                                                            } else {
                                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                    dValueOf3 = null;
                                                                                }
                                                                            }
                                                                            if (dValueOf3 != null) {
                                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar11111 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar11111.a, i4, hvzVar11111.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources11110 = r69Var.a;
                                                                                    return resources11110.getString(2131958634, resources11110.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (h79Var instanceof y69) {
                                                                            ArrayList arrayList16 = ((y69) h79Var).a;
                                                                            it8 = arrayList16.iterator();
                                                                            i2 = 0;
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    next2 = it8.next();
                                                                                    i3 = i2 + 1;
                                                                                    if (i2 >= 0) {
                                                                                        p7h.T();
                                                                                        throw null;
                                                                                    }
                                                                                    x69 x69Var12 = (x69) next2;
                                                                                    d10 = x69Var12.a;
                                                                                    double d1112 = x69Var12.b;
                                                                                    if (dN >= d10) {
                                                                                    }
                                                                                    i2 = i3;
                                                                                } else {
                                                                                    next2 = null;
                                                                                }
                                                                            }
                                                                            x69Var = (x69) next2;
                                                                            if (x69Var != null) {
                                                                                double d1113 = x69Var.a;
                                                                                dPow = (dN - d1113) / (x69Var.b - d1113);
                                                                                w69Var2 = x69Var.f;
                                                                                if (u890.j(w69Var2, t69Var)) {
                                                                                    if (w69Var2 instanceof u69) {
                                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                    } else if (w69Var2 instanceof v69) {
                                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i113 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i113);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar11112 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar11112.a, i4, hvzVar11112.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11111 = r69Var.a;
                                                                                                return resources11111.getString(2131958634, resources11111.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i114 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i114);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar11113 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar11113.a, i4, hvzVar11113.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11112 = r69Var.a;
                                                                                                return resources11112.getString(2131958634, resources11112.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        eg.o();
                                    }
                                }
                            }
                        } else {
                            arrayList2 = arrayList6;
                            d4 = dDoubleValue2;
                            z = h79Var instanceof o69;
                            if (z) {
                                o69 o69Var3 = (o69) h79Var;
                                d11 = o69Var3.a;
                                if (Math.abs(d11) <= Double.MAX_VALUE) {
                                    if (d13 <= 0.0d) {
                                        if (!arrayList2.isEmpty()) {
                                            it9 = arrayList2.iterator();
                                            while (true) {
                                                if (!it9.hasNext()) {
                                                    if (g0p1.A((z69) it9.next(), d)) {
                                                        d = 0.0d;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z3 = z;
                                    dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                    it7 = arrayList2.iterator();
                                    do {
                                        if (it7.hasNext()) {
                                            next = it7.next();
                                        } else {
                                            next = null;
                                        }
                                        z69Var2 = (z69) next;
                                        if (z69Var2 != null) {
                                            f79Var2 = z69Var2.b;
                                            if (f79Var2 instanceof d79) {
                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                            } else if (f79Var2 instanceof e79) {
                                                ivzVar = new ivz(((e79) f79Var2).a);
                                            } else {
                                                eg.o();
                                            }
                                            if (ivzVar instanceof hvz) {
                                                hvz hvzVar11114 = (hvz) ivzVar;
                                                return r69Var.a(hvzVar11114.a, i4, hvzVar11114.b);
                                            }
                                            if (ivzVar instanceof ivz) {
                                                iC = l1d.C(((ivz) ivzVar).a);
                                                if (iC != 0) {
                                                    if (iC != 1) {
                                                        if (i4 != 2) {
                                                        }
                                                        return r69Var.a(0.0d, i4, 1);
                                                    }
                                                    if (iC != 2) {
                                                    }
                                                    Resources resources11113 = r69Var.a;
                                                    return resources11113.getString(2131958634, resources11113.getString(2131958641));
                                                }
                                                if (i4 == 2) {
                                                    return r69Var.a(0.0d, i4, 1);
                                                }
                                            } else if (ivzVar != null) {
                                                eg.o();
                                            }
                                        } else if (z3) {
                                            o69Var = (o69) h79Var;
                                            if (dN <= 0.0d) {
                                                dValueOf3 = null;
                                            } else {
                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                dValueOf3 = Double.valueOf(dLog10);
                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                    dValueOf3 = null;
                                                }
                                            }
                                            if (dValueOf3 != null) {
                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                ivzVar = hvzVar;
                                            }
                                            if (ivzVar instanceof hvz) {
                                                hvz hvzVar11115 = (hvz) ivzVar;
                                                return r69Var.a(hvzVar11115.a, i4, hvzVar11115.b);
                                            }
                                            if (ivzVar instanceof ivz) {
                                                iC = l1d.C(((ivz) ivzVar).a);
                                                if (iC != 0) {
                                                    if (iC != 1) {
                                                        if (i4 != 2) {
                                                        }
                                                        return r69Var.a(0.0d, i4, 1);
                                                    }
                                                    if (iC != 2) {
                                                    }
                                                    Resources resources11114 = r69Var.a;
                                                    return resources11114.getString(2131958634, resources11114.getString(2131958641));
                                                }
                                                if (i4 == 2) {
                                                    return r69Var.a(0.0d, i4, 1);
                                                }
                                            } else if (ivzVar != null) {
                                                eg.o();
                                            }
                                        } else if (h79Var instanceof y69) {
                                            ArrayList arrayList17 = ((y69) h79Var).a;
                                            it8 = arrayList17.iterator();
                                            i2 = 0;
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    next2 = it8.next();
                                                    i3 = i2 + 1;
                                                    if (i2 >= 0) {
                                                        p7h.T();
                                                        throw null;
                                                    }
                                                    x69 x69Var13 = (x69) next2;
                                                    d10 = x69Var13.a;
                                                    double d1114 = x69Var13.b;
                                                    if (dN >= d10) {
                                                    }
                                                    i2 = i3;
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            x69Var = (x69) next2;
                                            if (x69Var != null) {
                                                double d1115 = x69Var.a;
                                                dPow = (dN - d1115) / (x69Var.b - d1115);
                                                w69Var2 = x69Var.f;
                                                if (u890.j(w69Var2, t69Var)) {
                                                    if (w69Var2 instanceof u69) {
                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                    } else if (w69Var2 instanceof v69) {
                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                    } else {
                                                        eg.o();
                                                    }
                                                    dValueOf = Double.valueOf(dPow);
                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                        dValueOf = null;
                                                    }
                                                    if (dValueOf != null) {
                                                        dDoubleValue = dValueOf.doubleValue();
                                                        int i115 = x69Var.e;
                                                        d8 = x69Var.d;
                                                        d9 = x69Var.c;
                                                        iC2 = l1d.C(i115);
                                                        if (iC2 != 0) {
                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                        } else if (iC2 == 1) {
                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                        } else {
                                                            eg.o();
                                                        }
                                                        dValueOf2 = Double.valueOf(dPow2);
                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                            dValueOf2 = null;
                                                        }
                                                        if (dValueOf2 != null) {
                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                            ivzVar = hvzVar;
                                                        }
                                                        if (ivzVar instanceof hvz) {
                                                            hvz hvzVar11116 = (hvz) ivzVar;
                                                            return r69Var.a(hvzVar11116.a, i4, hvzVar11116.b);
                                                        }
                                                        if (ivzVar instanceof ivz) {
                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                            if (iC != 0) {
                                                                if (iC != 1) {
                                                                    if (i4 != 2) {
                                                                    }
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                                if (iC != 2) {
                                                                }
                                                                Resources resources11115 = r69Var.a;
                                                                return resources11115.getString(2131958634, resources11115.getString(2131958641));
                                                            }
                                                            if (i4 == 2) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (ivzVar != null) {
                                                            eg.o();
                                                        }
                                                    }
                                                } else {
                                                    dValueOf = Double.valueOf(dPow);
                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                        dValueOf = null;
                                                    }
                                                    if (dValueOf != null) {
                                                        dDoubleValue = dValueOf.doubleValue();
                                                        int i116 = x69Var.e;
                                                        d8 = x69Var.d;
                                                        d9 = x69Var.c;
                                                        iC2 = l1d.C(i116);
                                                        if (iC2 != 0) {
                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                        } else if (iC2 == 1) {
                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                        } else {
                                                            eg.o();
                                                        }
                                                        dValueOf2 = Double.valueOf(dPow2);
                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                            dValueOf2 = null;
                                                        }
                                                        if (dValueOf2 != null) {
                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                            ivzVar = hvzVar;
                                                        }
                                                        if (ivzVar instanceof hvz) {
                                                            hvz hvzVar11117 = (hvz) ivzVar;
                                                            return r69Var.a(hvzVar11117.a, i4, hvzVar11117.b);
                                                        }
                                                        if (ivzVar instanceof ivz) {
                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                            if (iC != 0) {
                                                                if (iC != 1) {
                                                                    if (i4 != 2) {
                                                                    }
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                                if (iC != 2) {
                                                                }
                                                                Resources resources11116 = r69Var.a;
                                                                return resources11116.getString(2131958634, resources11116.getString(2131958641));
                                                            }
                                                            if (i4 == 2) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (ivzVar != null) {
                                                            eg.o();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            eg.o();
                                        }
                                    } while (!g0p1.A((z69) next, dN));
                                    z69Var2 = (z69) next;
                                    if (z69Var2 != null) {
                                        f79Var2 = z69Var2.b;
                                        if (f79Var2 instanceof d79) {
                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                        } else if (f79Var2 instanceof e79) {
                                            ivzVar = new ivz(((e79) f79Var2).a);
                                        } else {
                                            eg.o();
                                        }
                                        if (ivzVar instanceof hvz) {
                                            hvz hvzVar11118 = (hvz) ivzVar;
                                            return r69Var.a(hvzVar11118.a, i4, hvzVar11118.b);
                                        }
                                        if (ivzVar instanceof ivz) {
                                            iC = l1d.C(((ivz) ivzVar).a);
                                            if (iC != 0) {
                                                if (iC != 1) {
                                                    if (i4 != 2) {
                                                    }
                                                    return r69Var.a(0.0d, i4, 1);
                                                }
                                                if (iC != 2) {
                                                }
                                                Resources resources11117 = r69Var.a;
                                                return resources11117.getString(2131958634, resources11117.getString(2131958641));
                                            }
                                            if (i4 == 2) {
                                                return r69Var.a(0.0d, i4, 1);
                                            }
                                        } else if (ivzVar != null) {
                                            eg.o();
                                        }
                                    } else if (z3) {
                                        o69Var = (o69) h79Var;
                                        if (dN <= 0.0d) {
                                            dValueOf3 = null;
                                        } else {
                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                            dValueOf3 = Double.valueOf(dLog10);
                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                dValueOf3 = null;
                                            }
                                        }
                                        if (dValueOf3 != null) {
                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                            ivzVar = hvzVar;
                                        }
                                        if (ivzVar instanceof hvz) {
                                            hvz hvzVar11119 = (hvz) ivzVar;
                                            return r69Var.a(hvzVar11119.a, i4, hvzVar11119.b);
                                        }
                                        if (ivzVar instanceof ivz) {
                                            iC = l1d.C(((ivz) ivzVar).a);
                                            if (iC != 0) {
                                                if (iC != 1) {
                                                    if (i4 != 2) {
                                                    }
                                                    return r69Var.a(0.0d, i4, 1);
                                                }
                                                if (iC != 2) {
                                                }
                                                Resources resources11118 = r69Var.a;
                                                return resources11118.getString(2131958634, resources11118.getString(2131958641));
                                            }
                                            if (i4 == 2) {
                                                return r69Var.a(0.0d, i4, 1);
                                            }
                                        } else if (ivzVar != null) {
                                            eg.o();
                                        }
                                    } else if (h79Var instanceof y69) {
                                        ArrayList arrayList18 = ((y69) h79Var).a;
                                        it8 = arrayList18.iterator();
                                        i2 = 0;
                                        while (true) {
                                            if (it8.hasNext()) {
                                                next2 = it8.next();
                                                i3 = i2 + 1;
                                                if (i2 >= 0) {
                                                    p7h.T();
                                                    throw null;
                                                }
                                                x69 x69Var14 = (x69) next2;
                                                d10 = x69Var14.a;
                                                double d1116 = x69Var14.b;
                                                if (dN >= d10) {
                                                }
                                                i2 = i3;
                                            } else {
                                                next2 = null;
                                            }
                                        }
                                        x69Var = (x69) next2;
                                        if (x69Var != null) {
                                            double d1117 = x69Var.a;
                                            dPow = (dN - d1117) / (x69Var.b - d1117);
                                            w69Var2 = x69Var.f;
                                            if (u890.j(w69Var2, t69Var)) {
                                                if (w69Var2 instanceof u69) {
                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                } else if (w69Var2 instanceof v69) {
                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                } else {
                                                    eg.o();
                                                }
                                                dValueOf = Double.valueOf(dPow);
                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                    dValueOf = null;
                                                }
                                                if (dValueOf != null) {
                                                    dDoubleValue = dValueOf.doubleValue();
                                                    int i117 = x69Var.e;
                                                    d8 = x69Var.d;
                                                    d9 = x69Var.c;
                                                    iC2 = l1d.C(i117);
                                                    if (iC2 != 0) {
                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                    } else if (iC2 == 1) {
                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                    } else {
                                                        eg.o();
                                                    }
                                                    dValueOf2 = Double.valueOf(dPow2);
                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                        dValueOf2 = null;
                                                    }
                                                    if (dValueOf2 != null) {
                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                        ivzVar = hvzVar;
                                                    }
                                                    if (ivzVar instanceof hvz) {
                                                        hvz hvzVar111110 = (hvz) ivzVar;
                                                        return r69Var.a(hvzVar111110.a, i4, hvzVar111110.b);
                                                    }
                                                    if (ivzVar instanceof ivz) {
                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                        if (iC != 0) {
                                                            if (iC != 1) {
                                                                if (i4 != 2) {
                                                                }
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                            if (iC != 2) {
                                                            }
                                                            Resources resources11119 = r69Var.a;
                                                            return resources11119.getString(2131958634, resources11119.getString(2131958641));
                                                        }
                                                        if (i4 == 2) {
                                                            return r69Var.a(0.0d, i4, 1);
                                                        }
                                                    } else if (ivzVar != null) {
                                                        eg.o();
                                                    }
                                                }
                                            } else {
                                                dValueOf = Double.valueOf(dPow);
                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                    dValueOf = null;
                                                }
                                                if (dValueOf != null) {
                                                    dDoubleValue = dValueOf.doubleValue();
                                                    int i118 = x69Var.e;
                                                    d8 = x69Var.d;
                                                    d9 = x69Var.c;
                                                    iC2 = l1d.C(i118);
                                                    if (iC2 != 0) {
                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                    } else if (iC2 == 1) {
                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                    } else {
                                                        eg.o();
                                                    }
                                                    dValueOf2 = Double.valueOf(dPow2);
                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                        dValueOf2 = null;
                                                    }
                                                    if (dValueOf2 != null) {
                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                        ivzVar = hvzVar;
                                                    }
                                                    if (ivzVar instanceof hvz) {
                                                        hvz hvzVar111111 = (hvz) ivzVar;
                                                        return r69Var.a(hvzVar111111.a, i4, hvzVar111111.b);
                                                    }
                                                    if (ivzVar instanceof ivz) {
                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                        if (iC != 0) {
                                                            if (iC != 1) {
                                                                if (i4 != 2) {
                                                                }
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                            if (iC != 2) {
                                                            }
                                                            Resources resources111110 = r69Var.a;
                                                            return resources111110.getString(2131958634, resources111110.getString(2131958641));
                                                        }
                                                        if (i4 == 2) {
                                                            return r69Var.a(0.0d, i4, 1);
                                                        }
                                                    } else if (ivzVar != null) {
                                                        eg.o();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        eg.o();
                                    }
                                }
                            } else if (h79Var instanceof y69) {
                                arrayList3 = ((y69) h79Var).a;
                                if (!arrayList3.isEmpty()) {
                                    if (arrayList3.isEmpty()) {
                                        z3 = z;
                                        arrayList5 = arrayList3;
                                        if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                            listW1 = o7h.w1(arrayList5);
                                            if (listW1 instanceof Collection) {
                                                it6 = listW1.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        mmr0Var = (mmr0) it6.next();
                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                        }
                                                    } else {
                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                        it7 = arrayList2.iterator();
                                                        do {
                                                            if (it7.hasNext()) {
                                                                next = it7.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            z69Var2 = (z69) next;
                                                            if (z69Var2 != null) {
                                                                f79Var2 = z69Var2.b;
                                                                if (f79Var2 instanceof d79) {
                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                } else if (f79Var2 instanceof e79) {
                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar111112 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar111112.a, i4, hvzVar111112.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources111111 = r69Var.a;
                                                                        return resources111111.getString(2131958634, resources111111.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            } else if (z3) {
                                                                o69Var = (o69) h79Var;
                                                                if (dN <= 0.0d) {
                                                                    dValueOf3 = null;
                                                                } else {
                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                        dValueOf3 = null;
                                                                    }
                                                                }
                                                                if (dValueOf3 != null) {
                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                    ivzVar = hvzVar;
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar111113 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar111113.a, i4, hvzVar111113.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources111112 = r69Var.a;
                                                                        return resources111112.getString(2131958634, resources111112.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            } else if (h79Var instanceof y69) {
                                                                ArrayList arrayList19 = ((y69) h79Var).a;
                                                                it8 = arrayList19.iterator();
                                                                i2 = 0;
                                                                while (true) {
                                                                    if (it8.hasNext()) {
                                                                        next2 = it8.next();
                                                                        i3 = i2 + 1;
                                                                        if (i2 >= 0) {
                                                                            p7h.T();
                                                                            throw null;
                                                                        }
                                                                        x69 x69Var15 = (x69) next2;
                                                                        d10 = x69Var15.a;
                                                                        double d1118 = x69Var15.b;
                                                                        if (dN >= d10) {
                                                                        }
                                                                        i2 = i3;
                                                                    } else {
                                                                        next2 = null;
                                                                    }
                                                                }
                                                                x69Var = (x69) next2;
                                                                if (x69Var != null) {
                                                                    double d1119 = x69Var.a;
                                                                    dPow = (dN - d1119) / (x69Var.b - d1119);
                                                                    w69Var2 = x69Var.f;
                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                        if (w69Var2 instanceof u69) {
                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                        } else if (w69Var2 instanceof v69) {
                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf = Double.valueOf(dPow);
                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                            dValueOf = null;
                                                                        }
                                                                        if (dValueOf != null) {
                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                            int i119 = x69Var.e;
                                                                            d8 = x69Var.d;
                                                                            d9 = x69Var.c;
                                                                            iC2 = l1d.C(i119);
                                                                            if (iC2 != 0) {
                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                            } else if (iC2 == 1) {
                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                dValueOf2 = null;
                                                                            }
                                                                            if (dValueOf2 != null) {
                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar111114 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar111114.a, i4, hvzVar111114.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources111113 = r69Var.a;
                                                                                    return resources111113.getString(2131958634, resources111113.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        dValueOf = Double.valueOf(dPow);
                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                            dValueOf = null;
                                                                        }
                                                                        if (dValueOf != null) {
                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                            int i1110 = x69Var.e;
                                                                            d8 = x69Var.d;
                                                                            d9 = x69Var.c;
                                                                            iC2 = l1d.C(i1110);
                                                                            if (iC2 != 0) {
                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                            } else if (iC2 == 1) {
                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                dValueOf2 = null;
                                                                            }
                                                                            if (dValueOf2 != null) {
                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar111115 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar111115.a, i4, hvzVar111115.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources111114 = r69Var.a;
                                                                                    return resources111114.getString(2131958634, resources111114.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        } while (!g0p1.A((z69) next, dN));
                                                        z69Var2 = (z69) next;
                                                        if (z69Var2 != null) {
                                                            f79Var2 = z69Var2.b;
                                                            if (f79Var2 instanceof d79) {
                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                            } else if (f79Var2 instanceof e79) {
                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                            } else {
                                                                eg.o();
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar111116 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar111116.a, i4, hvzVar111116.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources111115 = r69Var.a;
                                                                    return resources111115.getString(2131958634, resources111115.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (z3) {
                                                            o69Var = (o69) h79Var;
                                                            if (dN <= 0.0d) {
                                                                dValueOf3 = null;
                                                            } else {
                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                    dValueOf3 = null;
                                                                }
                                                            }
                                                            if (dValueOf3 != null) {
                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar111117 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar111117.a, i4, hvzVar111117.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources111116 = r69Var.a;
                                                                    return resources111116.getString(2131958634, resources111116.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (h79Var instanceof y69) {
                                                            ArrayList arrayList110 = ((y69) h79Var).a;
                                                            it8 = arrayList110.iterator();
                                                            i2 = 0;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    next2 = it8.next();
                                                                    i3 = i2 + 1;
                                                                    if (i2 >= 0) {
                                                                        p7h.T();
                                                                        throw null;
                                                                    }
                                                                    x69 x69Var16 = (x69) next2;
                                                                    d10 = x69Var16.a;
                                                                    double d11110 = x69Var16.b;
                                                                    if (dN >= d10) {
                                                                    }
                                                                    i2 = i3;
                                                                } else {
                                                                    next2 = null;
                                                                }
                                                            }
                                                            x69Var = (x69) next2;
                                                            if (x69Var != null) {
                                                                double d11111 = x69Var.a;
                                                                dPow = (dN - d11111) / (x69Var.b - d11111);
                                                                w69Var2 = x69Var.f;
                                                                if (u890.j(w69Var2, t69Var)) {
                                                                    if (w69Var2 instanceof u69) {
                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                    } else if (w69Var2 instanceof v69) {
                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i1111 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i1111);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar111118 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar111118.a, i4, hvzVar111118.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources111117 = r69Var.a;
                                                                                return resources111117.getString(2131958634, resources111117.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                } else {
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i1112 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i1112);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar111119 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar111119.a, i4, hvzVar111119.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources111118 = r69Var.a;
                                                                                return resources111118.getString(2131958634, resources111118.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            eg.o();
                                                        }
                                                    }
                                                }
                                            } else {
                                                it6 = listW1.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        mmr0Var = (mmr0) it6.next();
                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                        }
                                                    } else {
                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                        it7 = arrayList2.iterator();
                                                        do {
                                                            if (it7.hasNext()) {
                                                                next = it7.next();
                                                            } else {
                                                                next = null;
                                                            }
                                                            z69Var2 = (z69) next;
                                                            if (z69Var2 != null) {
                                                                f79Var2 = z69Var2.b;
                                                                if (f79Var2 instanceof d79) {
                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                } else if (f79Var2 instanceof e79) {
                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar1111110 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar1111110.a, i4, hvzVar1111110.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources111119 = r69Var.a;
                                                                        return resources111119.getString(2131958634, resources111119.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            } else if (z3) {
                                                                o69Var = (o69) h79Var;
                                                                if (dN <= 0.0d) {
                                                                    dValueOf3 = null;
                                                                } else {
                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                        dValueOf3 = null;
                                                                    }
                                                                }
                                                                if (dValueOf3 != null) {
                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                    ivzVar = hvzVar;
                                                                }
                                                                if (ivzVar instanceof hvz) {
                                                                    hvz hvzVar1111111 = (hvz) ivzVar;
                                                                    return r69Var.a(hvzVar1111111.a, i4, hvzVar1111111.b);
                                                                }
                                                                if (ivzVar instanceof ivz) {
                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                    if (iC != 0) {
                                                                        if (iC != 1) {
                                                                            if (i4 != 2) {
                                                                            }
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                        if (iC != 2) {
                                                                        }
                                                                        Resources resources1111110 = r69Var.a;
                                                                        return resources1111110.getString(2131958634, resources1111110.getString(2131958641));
                                                                    }
                                                                    if (i4 == 2) {
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                } else if (ivzVar != null) {
                                                                    eg.o();
                                                                }
                                                            } else if (h79Var instanceof y69) {
                                                                ArrayList arrayList111 = ((y69) h79Var).a;
                                                                it8 = arrayList111.iterator();
                                                                i2 = 0;
                                                                while (true) {
                                                                    if (it8.hasNext()) {
                                                                        next2 = it8.next();
                                                                        i3 = i2 + 1;
                                                                        if (i2 >= 0) {
                                                                            p7h.T();
                                                                            throw null;
                                                                        }
                                                                        x69 x69Var17 = (x69) next2;
                                                                        d10 = x69Var17.a;
                                                                        double d11112 = x69Var17.b;
                                                                        if (dN >= d10) {
                                                                        }
                                                                        i2 = i3;
                                                                    } else {
                                                                        next2 = null;
                                                                    }
                                                                }
                                                                x69Var = (x69) next2;
                                                                if (x69Var != null) {
                                                                    double d11113 = x69Var.a;
                                                                    dPow = (dN - d11113) / (x69Var.b - d11113);
                                                                    w69Var2 = x69Var.f;
                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                        if (w69Var2 instanceof u69) {
                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                        } else if (w69Var2 instanceof v69) {
                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf = Double.valueOf(dPow);
                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                            dValueOf = null;
                                                                        }
                                                                        if (dValueOf != null) {
                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                            int i1113 = x69Var.e;
                                                                            d8 = x69Var.d;
                                                                            d9 = x69Var.c;
                                                                            iC2 = l1d.C(i1113);
                                                                            if (iC2 != 0) {
                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                            } else if (iC2 == 1) {
                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                dValueOf2 = null;
                                                                            }
                                                                            if (dValueOf2 != null) {
                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar1111112 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar1111112.a, i4, hvzVar1111112.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1111111 = r69Var.a;
                                                                                    return resources1111111.getString(2131958634, resources1111111.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        dValueOf = Double.valueOf(dPow);
                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                            dValueOf = null;
                                                                        }
                                                                        if (dValueOf != null) {
                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                            int i1114 = x69Var.e;
                                                                            d8 = x69Var.d;
                                                                            d9 = x69Var.c;
                                                                            iC2 = l1d.C(i1114);
                                                                            if (iC2 != 0) {
                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                            } else if (iC2 == 1) {
                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                dValueOf2 = null;
                                                                            }
                                                                            if (dValueOf2 != null) {
                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar1111113 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar1111113.a, i4, hvzVar1111113.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1111112 = r69Var.a;
                                                                                    return resources1111112.getString(2131958634, resources1111112.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        } while (!g0p1.A((z69) next, dN));
                                                        z69Var2 = (z69) next;
                                                        if (z69Var2 != null) {
                                                            f79Var2 = z69Var2.b;
                                                            if (f79Var2 instanceof d79) {
                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                            } else if (f79Var2 instanceof e79) {
                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                            } else {
                                                                eg.o();
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar1111114 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar1111114.a, i4, hvzVar1111114.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources1111113 = r69Var.a;
                                                                    return resources1111113.getString(2131958634, resources1111113.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (z3) {
                                                            o69Var = (o69) h79Var;
                                                            if (dN <= 0.0d) {
                                                                dValueOf3 = null;
                                                            } else {
                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                    dValueOf3 = null;
                                                                }
                                                            }
                                                            if (dValueOf3 != null) {
                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar1111115 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar1111115.a, i4, hvzVar1111115.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources1111114 = r69Var.a;
                                                                    return resources1111114.getString(2131958634, resources1111114.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (h79Var instanceof y69) {
                                                            ArrayList arrayList112 = ((y69) h79Var).a;
                                                            it8 = arrayList112.iterator();
                                                            i2 = 0;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    next2 = it8.next();
                                                                    i3 = i2 + 1;
                                                                    if (i2 >= 0) {
                                                                        p7h.T();
                                                                        throw null;
                                                                    }
                                                                    x69 x69Var18 = (x69) next2;
                                                                    d10 = x69Var18.a;
                                                                    double d11114 = x69Var18.b;
                                                                    if (dN >= d10) {
                                                                    }
                                                                    i2 = i3;
                                                                } else {
                                                                    next2 = null;
                                                                }
                                                            }
                                                            x69Var = (x69) next2;
                                                            if (x69Var != null) {
                                                                double d11115 = x69Var.a;
                                                                dPow = (dN - d11115) / (x69Var.b - d11115);
                                                                w69Var2 = x69Var.f;
                                                                if (u890.j(w69Var2, t69Var)) {
                                                                    if (w69Var2 instanceof u69) {
                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                    } else if (w69Var2 instanceof v69) {
                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i1115 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i1115);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar1111116 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar1111116.a, i4, hvzVar1111116.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources1111115 = r69Var.a;
                                                                                return resources1111115.getString(2131958634, resources1111115.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                } else {
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i1116 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i1116);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar1111117 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar1111117.a, i4, hvzVar1111117.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources1111116 = r69Var.a;
                                                                                return resources1111116.getString(2131958634, resources1111116.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            eg.o();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        it5 = arrayList3.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                x69 x69Var19 = (x69) it5.next();
                                                d5 = x69Var19.a;
                                                z2 = z;
                                                arrayList4 = arrayList3;
                                                double d23 = x69Var19.c;
                                                double d24 = x69Var19.b;
                                                double d25 = x69Var19.d;
                                                if (Math.abs(d5) > Double.MAX_VALUE) {
                                                }
                                            } else {
                                                z3 = z;
                                                arrayList5 = arrayList3;
                                                if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                                    listW1 = o7h.w1(arrayList5);
                                                    if (listW1 instanceof Collection) {
                                                        it6 = listW1.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                mmr0Var = (mmr0) it6.next();
                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                }
                                                            } else {
                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                it7 = arrayList2.iterator();
                                                                do {
                                                                    if (it7.hasNext()) {
                                                                        next = it7.next();
                                                                    } else {
                                                                        next = null;
                                                                    }
                                                                    z69Var2 = (z69) next;
                                                                    if (z69Var2 != null) {
                                                                        f79Var2 = z69Var2.b;
                                                                        if (f79Var2 instanceof d79) {
                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                        } else if (f79Var2 instanceof e79) {
                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar1111118 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar1111118.a, i4, hvzVar1111118.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources1111117 = r69Var.a;
                                                                                return resources1111117.getString(2131958634, resources1111117.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    } else if (z3) {
                                                                        o69Var = (o69) h79Var;
                                                                        if (dN <= 0.0d) {
                                                                            dValueOf3 = null;
                                                                        } else {
                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                dValueOf3 = null;
                                                                            }
                                                                        }
                                                                        if (dValueOf3 != null) {
                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar1111119 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar1111119.a, i4, hvzVar1111119.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources1111118 = r69Var.a;
                                                                                return resources1111118.getString(2131958634, resources1111118.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    } else if (h79Var instanceof y69) {
                                                                        ArrayList arrayList113 = ((y69) h79Var).a;
                                                                        it8 = arrayList113.iterator();
                                                                        i2 = 0;
                                                                        while (true) {
                                                                            if (it8.hasNext()) {
                                                                                next2 = it8.next();
                                                                                i3 = i2 + 1;
                                                                                if (i2 >= 0) {
                                                                                    p7h.T();
                                                                                    throw null;
                                                                                }
                                                                                x69 x69Var110 = (x69) next2;
                                                                                d10 = x69Var110.a;
                                                                                double d11116 = x69Var110.b;
                                                                                if (dN >= d10) {
                                                                                }
                                                                                i2 = i3;
                                                                            } else {
                                                                                next2 = null;
                                                                            }
                                                                        }
                                                                        x69Var = (x69) next2;
                                                                        if (x69Var != null) {
                                                                            double d11117 = x69Var.a;
                                                                            dPow = (dN - d11117) / (x69Var.b - d11117);
                                                                            w69Var2 = x69Var.f;
                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                if (w69Var2 instanceof u69) {
                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                } else if (w69Var2 instanceof v69) {
                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf = Double.valueOf(dPow);
                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                    dValueOf = null;
                                                                                }
                                                                                if (dValueOf != null) {
                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                    int i1117 = x69Var.e;
                                                                                    d8 = x69Var.d;
                                                                                    d9 = x69Var.c;
                                                                                    iC2 = l1d.C(i1117);
                                                                                    if (iC2 != 0) {
                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                    } else if (iC2 == 1) {
                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                        dValueOf2 = null;
                                                                                    }
                                                                                    if (dValueOf2 != null) {
                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar11111110 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar11111110.a, i4, hvzVar11111110.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources1111119 = r69Var.a;
                                                                                            return resources1111119.getString(2131958634, resources1111119.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                dValueOf = Double.valueOf(dPow);
                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                    dValueOf = null;
                                                                                }
                                                                                if (dValueOf != null) {
                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                    int i1118 = x69Var.e;
                                                                                    d8 = x69Var.d;
                                                                                    d9 = x69Var.c;
                                                                                    iC2 = l1d.C(i1118);
                                                                                    if (iC2 != 0) {
                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                    } else if (iC2 == 1) {
                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                        dValueOf2 = null;
                                                                                    }
                                                                                    if (dValueOf2 != null) {
                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar11111111 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar11111111.a, i4, hvzVar11111111.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources11111110 = r69Var.a;
                                                                                            return resources11111110.getString(2131958634, resources11111110.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                } while (!g0p1.A((z69) next, dN));
                                                                z69Var2 = (z69) next;
                                                                if (z69Var2 != null) {
                                                                    f79Var2 = z69Var2.b;
                                                                    if (f79Var2 instanceof d79) {
                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                    } else if (f79Var2 instanceof e79) {
                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar11111112 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar11111112.a, i4, hvzVar11111112.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources11111111 = r69Var.a;
                                                                            return resources11111111.getString(2131958634, resources11111111.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                } else if (z3) {
                                                                    o69Var = (o69) h79Var;
                                                                    if (dN <= 0.0d) {
                                                                        dValueOf3 = null;
                                                                    } else {
                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                            dValueOf3 = null;
                                                                        }
                                                                    }
                                                                    if (dValueOf3 != null) {
                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar11111113 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar11111113.a, i4, hvzVar11111113.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources11111112 = r69Var.a;
                                                                            return resources11111112.getString(2131958634, resources11111112.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                } else if (h79Var instanceof y69) {
                                                                    ArrayList arrayList114 = ((y69) h79Var).a;
                                                                    it8 = arrayList114.iterator();
                                                                    i2 = 0;
                                                                    while (true) {
                                                                        if (it8.hasNext()) {
                                                                            next2 = it8.next();
                                                                            i3 = i2 + 1;
                                                                            if (i2 >= 0) {
                                                                                p7h.T();
                                                                                throw null;
                                                                            }
                                                                            x69 x69Var111 = (x69) next2;
                                                                            d10 = x69Var111.a;
                                                                            double d11118 = x69Var111.b;
                                                                            if (dN >= d10) {
                                                                            }
                                                                            i2 = i3;
                                                                        } else {
                                                                            next2 = null;
                                                                        }
                                                                    }
                                                                    x69Var = (x69) next2;
                                                                    if (x69Var != null) {
                                                                        double d11119 = x69Var.a;
                                                                        dPow = (dN - d11119) / (x69Var.b - d11119);
                                                                        w69Var2 = x69Var.f;
                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                            if (w69Var2 instanceof u69) {
                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                            } else if (w69Var2 instanceof v69) {
                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf = Double.valueOf(dPow);
                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                dValueOf = null;
                                                                            }
                                                                            if (dValueOf != null) {
                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                int i1119 = x69Var.e;
                                                                                d8 = x69Var.d;
                                                                                d9 = x69Var.c;
                                                                                iC2 = l1d.C(i1119);
                                                                                if (iC2 != 0) {
                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                } else if (iC2 == 1) {
                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                    dValueOf2 = null;
                                                                                }
                                                                                if (dValueOf2 != null) {
                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar11111114 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar11111114.a, i4, hvzVar11111114.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources11111113 = r69Var.a;
                                                                                        return resources11111113.getString(2131958634, resources11111113.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            dValueOf = Double.valueOf(dPow);
                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                dValueOf = null;
                                                                            }
                                                                            if (dValueOf != null) {
                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                int i11110 = x69Var.e;
                                                                                d8 = x69Var.d;
                                                                                d9 = x69Var.c;
                                                                                iC2 = l1d.C(i11110);
                                                                                if (iC2 != 0) {
                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                } else if (iC2 == 1) {
                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                    dValueOf2 = null;
                                                                                }
                                                                                if (dValueOf2 != null) {
                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar11111115 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar11111115.a, i4, hvzVar11111115.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources11111114 = r69Var.a;
                                                                                        return resources11111114.getString(2131958634, resources11111114.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        it6 = listW1.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                mmr0Var = (mmr0) it6.next();
                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                }
                                                            } else {
                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                it7 = arrayList2.iterator();
                                                                do {
                                                                    if (it7.hasNext()) {
                                                                        next = it7.next();
                                                                    } else {
                                                                        next = null;
                                                                    }
                                                                    z69Var2 = (z69) next;
                                                                    if (z69Var2 != null) {
                                                                        f79Var2 = z69Var2.b;
                                                                        if (f79Var2 instanceof d79) {
                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                        } else if (f79Var2 instanceof e79) {
                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar11111116 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar11111116.a, i4, hvzVar11111116.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources11111115 = r69Var.a;
                                                                                return resources11111115.getString(2131958634, resources11111115.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    } else if (z3) {
                                                                        o69Var = (o69) h79Var;
                                                                        if (dN <= 0.0d) {
                                                                            dValueOf3 = null;
                                                                        } else {
                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                dValueOf3 = null;
                                                                            }
                                                                        }
                                                                        if (dValueOf3 != null) {
                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar11111117 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar11111117.a, i4, hvzVar11111117.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources11111116 = r69Var.a;
                                                                                return resources11111116.getString(2131958634, resources11111116.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    } else if (h79Var instanceof y69) {
                                                                        ArrayList arrayList115 = ((y69) h79Var).a;
                                                                        it8 = arrayList115.iterator();
                                                                        i2 = 0;
                                                                        while (true) {
                                                                            if (it8.hasNext()) {
                                                                                next2 = it8.next();
                                                                                i3 = i2 + 1;
                                                                                if (i2 >= 0) {
                                                                                    p7h.T();
                                                                                    throw null;
                                                                                }
                                                                                x69 x69Var112 = (x69) next2;
                                                                                d10 = x69Var112.a;
                                                                                double d111110 = x69Var112.b;
                                                                                if (dN >= d10) {
                                                                                }
                                                                                i2 = i3;
                                                                            } else {
                                                                                next2 = null;
                                                                            }
                                                                        }
                                                                        x69Var = (x69) next2;
                                                                        if (x69Var != null) {
                                                                            double d111111 = x69Var.a;
                                                                            dPow = (dN - d111111) / (x69Var.b - d111111);
                                                                            w69Var2 = x69Var.f;
                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                if (w69Var2 instanceof u69) {
                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                } else if (w69Var2 instanceof v69) {
                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf = Double.valueOf(dPow);
                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                    dValueOf = null;
                                                                                }
                                                                                if (dValueOf != null) {
                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                    int i11111 = x69Var.e;
                                                                                    d8 = x69Var.d;
                                                                                    d9 = x69Var.c;
                                                                                    iC2 = l1d.C(i11111);
                                                                                    if (iC2 != 0) {
                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                    } else if (iC2 == 1) {
                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                        dValueOf2 = null;
                                                                                    }
                                                                                    if (dValueOf2 != null) {
                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar11111118 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar11111118.a, i4, hvzVar11111118.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources11111117 = r69Var.a;
                                                                                            return resources11111117.getString(2131958634, resources11111117.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                dValueOf = Double.valueOf(dPow);
                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                    dValueOf = null;
                                                                                }
                                                                                if (dValueOf != null) {
                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                    int i11112 = x69Var.e;
                                                                                    d8 = x69Var.d;
                                                                                    d9 = x69Var.c;
                                                                                    iC2 = l1d.C(i11112);
                                                                                    if (iC2 != 0) {
                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                    } else if (iC2 == 1) {
                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                        dValueOf2 = null;
                                                                                    }
                                                                                    if (dValueOf2 != null) {
                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar11111119 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar11111119.a, i4, hvzVar11111119.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources11111118 = r69Var.a;
                                                                                            return resources11111118.getString(2131958634, resources11111118.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                } while (!g0p1.A((z69) next, dN));
                                                                z69Var2 = (z69) next;
                                                                if (z69Var2 != null) {
                                                                    f79Var2 = z69Var2.b;
                                                                    if (f79Var2 instanceof d79) {
                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                    } else if (f79Var2 instanceof e79) {
                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar111111110 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar111111110.a, i4, hvzVar111111110.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources11111119 = r69Var.a;
                                                                            return resources11111119.getString(2131958634, resources11111119.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                } else if (z3) {
                                                                    o69Var = (o69) h79Var;
                                                                    if (dN <= 0.0d) {
                                                                        dValueOf3 = null;
                                                                    } else {
                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                            dValueOf3 = null;
                                                                        }
                                                                    }
                                                                    if (dValueOf3 != null) {
                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar111111111 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar111111111.a, i4, hvzVar111111111.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources111111110 = r69Var.a;
                                                                            return resources111111110.getString(2131958634, resources111111110.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                } else if (h79Var instanceof y69) {
                                                                    ArrayList arrayList116 = ((y69) h79Var).a;
                                                                    it8 = arrayList116.iterator();
                                                                    i2 = 0;
                                                                    while (true) {
                                                                        if (it8.hasNext()) {
                                                                            next2 = it8.next();
                                                                            i3 = i2 + 1;
                                                                            if (i2 >= 0) {
                                                                                p7h.T();
                                                                                throw null;
                                                                            }
                                                                            x69 x69Var113 = (x69) next2;
                                                                            d10 = x69Var113.a;
                                                                            double d111112 = x69Var113.b;
                                                                            if (dN >= d10) {
                                                                            }
                                                                            i2 = i3;
                                                                        } else {
                                                                            next2 = null;
                                                                        }
                                                                    }
                                                                    x69Var = (x69) next2;
                                                                    if (x69Var != null) {
                                                                        double d111113 = x69Var.a;
                                                                        dPow = (dN - d111113) / (x69Var.b - d111113);
                                                                        w69Var2 = x69Var.f;
                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                            if (w69Var2 instanceof u69) {
                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                            } else if (w69Var2 instanceof v69) {
                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            dValueOf = Double.valueOf(dPow);
                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                dValueOf = null;
                                                                            }
                                                                            if (dValueOf != null) {
                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                int i11113 = x69Var.e;
                                                                                d8 = x69Var.d;
                                                                                d9 = x69Var.c;
                                                                                iC2 = l1d.C(i11113);
                                                                                if (iC2 != 0) {
                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                } else if (iC2 == 1) {
                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                    dValueOf2 = null;
                                                                                }
                                                                                if (dValueOf2 != null) {
                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar111111112 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar111111112.a, i4, hvzVar111111112.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources111111111 = r69Var.a;
                                                                                        return resources111111111.getString(2131958634, resources111111111.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            dValueOf = Double.valueOf(dPow);
                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                dValueOf = null;
                                                                            }
                                                                            if (dValueOf != null) {
                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                int i11114 = x69Var.e;
                                                                                d8 = x69Var.d;
                                                                                d9 = x69Var.c;
                                                                                iC2 = l1d.C(i11114);
                                                                                if (iC2 != 0) {
                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                } else if (iC2 == 1) {
                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                    dValueOf2 = null;
                                                                                }
                                                                                if (dValueOf2 != null) {
                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar111111113 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar111111113.a, i4, hvzVar111111113.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources111111112 = r69Var.a;
                                                                                        return resources111111112.getString(2131958634, resources111111112.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z = z2;
                                            arrayList3 = arrayList4;
                                        }
                                    }
                                }
                            } else {
                                eg.o();
                            }
                        }
                    } else {
                        Iterator it10 = arrayList6.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                obj4 = null;
                                z69 z69Var4 = (z69) it10.next();
                                c79 c79Var4 = z69Var4.a;
                                if (c79Var4 instanceof a79) {
                                    if (Math.abs(((a79) c79Var4).a) <= Double.MAX_VALUE) {
                                        f79Var = z69Var4.b;
                                        if (f79Var instanceof d79) {
                                            if (Math.abs(((d79) f79Var).a) <= Double.MAX_VALUE) {
                                            }
                                        } else if (f79Var instanceof e79) {
                                            eg.o();
                                        }
                                    }
                                } else if (c79Var4 instanceof b79) {
                                    b79 b79Var5 = (b79) c79Var4;
                                    double d26 = b79Var5.b;
                                    double d27 = b79Var5.a;
                                    if (Math.abs(d27) <= Double.MAX_VALUE && Math.abs(d26) <= Double.MAX_VALUE && d27 < d26) {
                                        f79Var = z69Var4.b;
                                        if (f79Var instanceof d79) {
                                            if (Math.abs(((d79) f79Var).a) <= Double.MAX_VALUE) {
                                            }
                                        } else if (f79Var instanceof e79) {
                                            eg.o();
                                        }
                                    }
                                } else {
                                    eg.o();
                                }
                            } else {
                                d = 0.0d;
                                obj4 = null;
                                collectionK = p7h.K(arrayList6);
                                if (collectionK instanceof Collection) {
                                    it = collectionK.iterator();
                                    while (true) {
                                        if (((sr80) it).c) {
                                            iNextInt = ((lr80) it).nextInt();
                                            collectionQ = yoi1.Q(iNextInt + 1, arrayList6.size());
                                            if (collectionQ instanceof Collection) {
                                                it2 = collectionQ.iterator();
                                                while (true) {
                                                    if (((sr80) it2).c) {
                                                        int iNextInt3 = ((lr80) it2).nextInt();
                                                        it3 = it;
                                                        z69 z69Var5 = (z69) arrayList6.get(iNextInt);
                                                        z69Var = (z69) arrayList6.get(iNextInt3);
                                                        c79Var = z69Var5.a;
                                                        arrayList = arrayList6;
                                                        if (c79Var instanceof a79) {
                                                            c79Var3 = z69Var.a;
                                                            if (c79Var3 instanceof a79) {
                                                                i = iNextInt;
                                                                if (((a79) c79Var).a == ((a79) c79Var3).a) {
                                                                }
                                                                it4 = it2;
                                                                it = it3;
                                                                iNextInt = i;
                                                                it2 = it4;
                                                                arrayList6 = arrayList;
                                                                dDoubleValue2 = dDoubleValue2;
                                                            } else {
                                                                i = iNextInt;
                                                                if (c79Var3 instanceof b79) {
                                                                    d3 = ((a79) c79Var).a;
                                                                    b79Var4 = (b79) c79Var3;
                                                                    if (d3 > b79Var4.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        } else {
                                                            i = iNextInt;
                                                            if (c79Var instanceof b79) {
                                                                c79Var2 = z69Var.a;
                                                                if (c79Var2 instanceof a79) {
                                                                    d2 = ((a79) c79Var2).a;
                                                                    b79Var3 = (b79) c79Var;
                                                                    if (d2 > b79Var3.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else if (c79Var2 instanceof b79) {
                                                                    b79Var = (b79) c79Var;
                                                                    b79Var2 = (b79) c79Var2;
                                                                    it4 = it2;
                                                                    if (Math.max(b79Var.a, b79Var2.a) >= Math.min(b79Var.b, b79Var2.b)) {
                                                                        it = it3;
                                                                        iNextInt = i;
                                                                        it2 = it4;
                                                                        arrayList6 = arrayList;
                                                                        dDoubleValue2 = dDoubleValue2;
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        }
                                                    } else {
                                                        it = it;
                                                        arrayList6 = arrayList6;
                                                        dDoubleValue2 = dDoubleValue2;
                                                    }
                                                }
                                            } else {
                                                it2 = collectionQ.iterator();
                                                while (true) {
                                                    if (((sr80) it2).c) {
                                                        int iNextInt4 = ((lr80) it2).nextInt();
                                                        it3 = it;
                                                        z69 z69Var6 = (z69) arrayList6.get(iNextInt);
                                                        z69Var = (z69) arrayList6.get(iNextInt4);
                                                        c79Var = z69Var6.a;
                                                        arrayList = arrayList6;
                                                        if (c79Var instanceof a79) {
                                                            c79Var3 = z69Var.a;
                                                            if (c79Var3 instanceof a79) {
                                                                i = iNextInt;
                                                                if (((a79) c79Var).a == ((a79) c79Var3).a) {
                                                                }
                                                                it4 = it2;
                                                                it = it3;
                                                                iNextInt = i;
                                                                it2 = it4;
                                                                arrayList6 = arrayList;
                                                                dDoubleValue2 = dDoubleValue2;
                                                            } else {
                                                                i = iNextInt;
                                                                if (c79Var3 instanceof b79) {
                                                                    d3 = ((a79) c79Var).a;
                                                                    b79Var4 = (b79) c79Var3;
                                                                    if (d3 > b79Var4.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        } else {
                                                            i = iNextInt;
                                                            if (c79Var instanceof b79) {
                                                                c79Var2 = z69Var.a;
                                                                if (c79Var2 instanceof a79) {
                                                                    d2 = ((a79) c79Var2).a;
                                                                    b79Var3 = (b79) c79Var;
                                                                    if (d2 > b79Var3.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else if (c79Var2 instanceof b79) {
                                                                    b79Var = (b79) c79Var;
                                                                    b79Var2 = (b79) c79Var2;
                                                                    it4 = it2;
                                                                    if (Math.max(b79Var.a, b79Var2.a) >= Math.min(b79Var.b, b79Var2.b)) {
                                                                        it = it3;
                                                                        iNextInt = i;
                                                                        it2 = it4;
                                                                        arrayList6 = arrayList;
                                                                        dDoubleValue2 = dDoubleValue2;
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        }
                                                    } else {
                                                        it = it;
                                                        arrayList6 = arrayList6;
                                                        dDoubleValue2 = dDoubleValue2;
                                                    }
                                                }
                                            }
                                            if (ivzVar instanceof hvz) {
                                                hvz hvzVar111111114 = (hvz) ivzVar;
                                                return r69Var.a(hvzVar111111114.a, i4, hvzVar111111114.b);
                                            }
                                            if (ivzVar instanceof ivz) {
                                                iC = l1d.C(((ivz) ivzVar).a);
                                                if (iC != 0) {
                                                    if (iC != 1) {
                                                        if (i4 != 2) {
                                                        }
                                                        return r69Var.a(0.0d, i4, 1);
                                                    }
                                                    if (iC != 2) {
                                                    }
                                                    Resources resources111111113 = r69Var.a;
                                                    return resources111111113.getString(2131958634, resources111111113.getString(2131958641));
                                                }
                                                if (i4 == 2) {
                                                    return r69Var.a(0.0d, i4, 1);
                                                }
                                            } else if (ivzVar != null) {
                                                eg.o();
                                            }
                                        } else {
                                            arrayList2 = arrayList6;
                                            d4 = dDoubleValue2;
                                            z = h79Var instanceof o69;
                                            if (z) {
                                                o69 o69Var4 = (o69) h79Var;
                                                d11 = o69Var4.a;
                                                if (Math.abs(d11) <= Double.MAX_VALUE) {
                                                    if (d13 <= 0.0d) {
                                                        if (!arrayList2.isEmpty()) {
                                                            it9 = arrayList2.iterator();
                                                            while (true) {
                                                                if (!it9.hasNext()) {
                                                                    if (g0p1.A((z69) it9.next(), d)) {
                                                                        d = 0.0d;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z3 = z;
                                                    dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                    it7 = arrayList2.iterator();
                                                    do {
                                                        if (it7.hasNext()) {
                                                            next = it7.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        z69Var2 = (z69) next;
                                                        if (z69Var2 != null) {
                                                            f79Var2 = z69Var2.b;
                                                            if (f79Var2 instanceof d79) {
                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                            } else if (f79Var2 instanceof e79) {
                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                            } else {
                                                                eg.o();
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar111111115 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar111111115.a, i4, hvzVar111111115.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources111111114 = r69Var.a;
                                                                    return resources111111114.getString(2131958634, resources111111114.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (z3) {
                                                            o69Var = (o69) h79Var;
                                                            if (dN <= 0.0d) {
                                                                dValueOf3 = null;
                                                            } else {
                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                    dValueOf3 = null;
                                                                }
                                                            }
                                                            if (dValueOf3 != null) {
                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar111111116 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar111111116.a, i4, hvzVar111111116.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources111111115 = r69Var.a;
                                                                    return resources111111115.getString(2131958634, resources111111115.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (h79Var instanceof y69) {
                                                            ArrayList arrayList117 = ((y69) h79Var).a;
                                                            it8 = arrayList117.iterator();
                                                            i2 = 0;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    next2 = it8.next();
                                                                    i3 = i2 + 1;
                                                                    if (i2 >= 0) {
                                                                        p7h.T();
                                                                        throw null;
                                                                    }
                                                                    x69 x69Var114 = (x69) next2;
                                                                    d10 = x69Var114.a;
                                                                    double d111114 = x69Var114.b;
                                                                    if (dN >= d10) {
                                                                    }
                                                                    i2 = i3;
                                                                } else {
                                                                    next2 = null;
                                                                }
                                                            }
                                                            x69Var = (x69) next2;
                                                            if (x69Var != null) {
                                                                double d111115 = x69Var.a;
                                                                dPow = (dN - d111115) / (x69Var.b - d111115);
                                                                w69Var2 = x69Var.f;
                                                                if (u890.j(w69Var2, t69Var)) {
                                                                    if (w69Var2 instanceof u69) {
                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                    } else if (w69Var2 instanceof v69) {
                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i11115 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i11115);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar111111117 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar111111117.a, i4, hvzVar111111117.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources111111116 = r69Var.a;
                                                                                return resources111111116.getString(2131958634, resources111111116.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                } else {
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i11116 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i11116);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar111111118 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar111111118.a, i4, hvzVar111111118.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources111111117 = r69Var.a;
                                                                                return resources111111117.getString(2131958634, resources111111117.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            eg.o();
                                                        }
                                                    } while (!g0p1.A((z69) next, dN));
                                                    z69Var2 = (z69) next;
                                                    if (z69Var2 != null) {
                                                        f79Var2 = z69Var2.b;
                                                        if (f79Var2 instanceof d79) {
                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                        } else if (f79Var2 instanceof e79) {
                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                        } else {
                                                            eg.o();
                                                        }
                                                        if (ivzVar instanceof hvz) {
                                                            hvz hvzVar111111119 = (hvz) ivzVar;
                                                            return r69Var.a(hvzVar111111119.a, i4, hvzVar111111119.b);
                                                        }
                                                        if (ivzVar instanceof ivz) {
                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                            if (iC != 0) {
                                                                if (iC != 1) {
                                                                    if (i4 != 2) {
                                                                    }
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                                if (iC != 2) {
                                                                }
                                                                Resources resources111111118 = r69Var.a;
                                                                return resources111111118.getString(2131958634, resources111111118.getString(2131958641));
                                                            }
                                                            if (i4 == 2) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (ivzVar != null) {
                                                            eg.o();
                                                        }
                                                    } else if (z3) {
                                                        o69Var = (o69) h79Var;
                                                        if (dN <= 0.0d) {
                                                            dValueOf3 = null;
                                                        } else {
                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                            dValueOf3 = Double.valueOf(dLog10);
                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                dValueOf3 = null;
                                                            }
                                                        }
                                                        if (dValueOf3 != null) {
                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                            ivzVar = hvzVar;
                                                        }
                                                        if (ivzVar instanceof hvz) {
                                                            hvz hvzVar1111111110 = (hvz) ivzVar;
                                                            return r69Var.a(hvzVar1111111110.a, i4, hvzVar1111111110.b);
                                                        }
                                                        if (ivzVar instanceof ivz) {
                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                            if (iC != 0) {
                                                                if (iC != 1) {
                                                                    if (i4 != 2) {
                                                                    }
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                                if (iC != 2) {
                                                                }
                                                                Resources resources111111119 = r69Var.a;
                                                                return resources111111119.getString(2131958634, resources111111119.getString(2131958641));
                                                            }
                                                            if (i4 == 2) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (ivzVar != null) {
                                                            eg.o();
                                                        }
                                                    } else if (h79Var instanceof y69) {
                                                        ArrayList arrayList118 = ((y69) h79Var).a;
                                                        it8 = arrayList118.iterator();
                                                        i2 = 0;
                                                        while (true) {
                                                            if (it8.hasNext()) {
                                                                next2 = it8.next();
                                                                i3 = i2 + 1;
                                                                if (i2 >= 0) {
                                                                    p7h.T();
                                                                    throw null;
                                                                }
                                                                x69 x69Var115 = (x69) next2;
                                                                d10 = x69Var115.a;
                                                                double d111116 = x69Var115.b;
                                                                if (dN >= d10) {
                                                                }
                                                                i2 = i3;
                                                            } else {
                                                                next2 = null;
                                                            }
                                                        }
                                                        x69Var = (x69) next2;
                                                        if (x69Var != null) {
                                                            double d111117 = x69Var.a;
                                                            dPow = (dN - d111117) / (x69Var.b - d111117);
                                                            w69Var2 = x69Var.f;
                                                            if (u890.j(w69Var2, t69Var)) {
                                                                if (w69Var2 instanceof u69) {
                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                } else if (w69Var2 instanceof v69) {
                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                dValueOf = Double.valueOf(dPow);
                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                    dValueOf = null;
                                                                }
                                                                if (dValueOf != null) {
                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                    int i11117 = x69Var.e;
                                                                    d8 = x69Var.d;
                                                                    d9 = x69Var.c;
                                                                    iC2 = l1d.C(i11117);
                                                                    if (iC2 != 0) {
                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                    } else if (iC2 == 1) {
                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                        dValueOf2 = null;
                                                                    }
                                                                    if (dValueOf2 != null) {
                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar1111111111 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar1111111111.a, i4, hvzVar1111111111.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources1111111110 = r69Var.a;
                                                                            return resources1111111110.getString(2131958634, resources1111111110.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                }
                                                            } else {
                                                                dValueOf = Double.valueOf(dPow);
                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                    dValueOf = null;
                                                                }
                                                                if (dValueOf != null) {
                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                    int i11118 = x69Var.e;
                                                                    d8 = x69Var.d;
                                                                    d9 = x69Var.c;
                                                                    iC2 = l1d.C(i11118);
                                                                    if (iC2 != 0) {
                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                    } else if (iC2 == 1) {
                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                        dValueOf2 = null;
                                                                    }
                                                                    if (dValueOf2 != null) {
                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar1111111112 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar1111111112.a, i4, hvzVar1111111112.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources1111111111 = r69Var.a;
                                                                            return resources1111111111.getString(2131958634, resources1111111111.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        eg.o();
                                                    }
                                                }
                                            } else if (h79Var instanceof y69) {
                                                arrayList3 = ((y69) h79Var).a;
                                                if (!arrayList3.isEmpty()) {
                                                    if (arrayList3.isEmpty()) {
                                                        z3 = z;
                                                        arrayList5 = arrayList3;
                                                        if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                                            listW1 = o7h.w1(arrayList5);
                                                            if (listW1 instanceof Collection) {
                                                                it6 = listW1.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        mmr0Var = (mmr0) it6.next();
                                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                        }
                                                                    } else {
                                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                        it7 = arrayList2.iterator();
                                                                        do {
                                                                            if (it7.hasNext()) {
                                                                                next = it7.next();
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                            z69Var2 = (z69) next;
                                                                            if (z69Var2 != null) {
                                                                                f79Var2 = z69Var2.b;
                                                                                if (f79Var2 instanceof d79) {
                                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                } else if (f79Var2 instanceof e79) {
                                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar1111111113 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar1111111113.a, i4, hvzVar1111111113.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources1111111112 = r69Var.a;
                                                                                        return resources1111111112.getString(2131958634, resources1111111112.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (z3) {
                                                                                o69Var = (o69) h79Var;
                                                                                if (dN <= 0.0d) {
                                                                                    dValueOf3 = null;
                                                                                } else {
                                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                        dValueOf3 = null;
                                                                                    }
                                                                                }
                                                                                if (dValueOf3 != null) {
                                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar1111111114 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar1111111114.a, i4, hvzVar1111111114.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources1111111113 = r69Var.a;
                                                                                        return resources1111111113.getString(2131958634, resources1111111113.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (h79Var instanceof y69) {
                                                                                ArrayList arrayList119 = ((y69) h79Var).a;
                                                                                it8 = arrayList119.iterator();
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        next2 = it8.next();
                                                                                        i3 = i2 + 1;
                                                                                        if (i2 >= 0) {
                                                                                            p7h.T();
                                                                                            throw null;
                                                                                        }
                                                                                        x69 x69Var116 = (x69) next2;
                                                                                        d10 = x69Var116.a;
                                                                                        double d111118 = x69Var116.b;
                                                                                        if (dN >= d10) {
                                                                                        }
                                                                                        i2 = i3;
                                                                                    } else {
                                                                                        next2 = null;
                                                                                    }
                                                                                }
                                                                                x69Var = (x69) next2;
                                                                                if (x69Var != null) {
                                                                                    double d111119 = x69Var.a;
                                                                                    dPow = (dN - d111119) / (x69Var.b - d111119);
                                                                                    w69Var2 = x69Var.f;
                                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                                        if (w69Var2 instanceof u69) {
                                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                        } else if (w69Var2 instanceof v69) {
                                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i11119 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i11119);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar1111111115 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar1111111115.a, i4, hvzVar1111111115.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources1111111114 = r69Var.a;
                                                                                                    return resources1111111114.getString(2131958634, resources1111111114.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i111110 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i111110);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar1111111116 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar1111111116.a, i4, hvzVar1111111116.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources1111111115 = r69Var.a;
                                                                                                    return resources1111111115.getString(2131958634, resources1111111115.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                        } while (!g0p1.A((z69) next, dN));
                                                                        z69Var2 = (z69) next;
                                                                        if (z69Var2 != null) {
                                                                            f79Var2 = z69Var2.b;
                                                                            if (f79Var2 instanceof d79) {
                                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                            } else if (f79Var2 instanceof e79) {
                                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar1111111117 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar1111111117.a, i4, hvzVar1111111117.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1111111116 = r69Var.a;
                                                                                    return resources1111111116.getString(2131958634, resources1111111116.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (z3) {
                                                                            o69Var = (o69) h79Var;
                                                                            if (dN <= 0.0d) {
                                                                                dValueOf3 = null;
                                                                            } else {
                                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                    dValueOf3 = null;
                                                                                }
                                                                            }
                                                                            if (dValueOf3 != null) {
                                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar1111111118 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar1111111118.a, i4, hvzVar1111111118.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources1111111117 = r69Var.a;
                                                                                    return resources1111111117.getString(2131958634, resources1111111117.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (h79Var instanceof y69) {
                                                                            ArrayList arrayList1110 = ((y69) h79Var).a;
                                                                            it8 = arrayList1110.iterator();
                                                                            i2 = 0;
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    next2 = it8.next();
                                                                                    i3 = i2 + 1;
                                                                                    if (i2 >= 0) {
                                                                                        p7h.T();
                                                                                        throw null;
                                                                                    }
                                                                                    x69 x69Var117 = (x69) next2;
                                                                                    d10 = x69Var117.a;
                                                                                    double d1111110 = x69Var117.b;
                                                                                    if (dN >= d10) {
                                                                                    }
                                                                                    i2 = i3;
                                                                                } else {
                                                                                    next2 = null;
                                                                                }
                                                                            }
                                                                            x69Var = (x69) next2;
                                                                            if (x69Var != null) {
                                                                                double d1111111 = x69Var.a;
                                                                                dPow = (dN - d1111111) / (x69Var.b - d1111111);
                                                                                w69Var2 = x69Var.f;
                                                                                if (u890.j(w69Var2, t69Var)) {
                                                                                    if (w69Var2 instanceof u69) {
                                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                    } else if (w69Var2 instanceof v69) {
                                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i111111 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i111111);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1111111119 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1111111119.a, i4, hvzVar1111111119.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1111111118 = r69Var.a;
                                                                                                return resources1111111118.getString(2131958634, resources1111111118.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i111112 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i111112);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar11111111110 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar11111111110.a, i4, hvzVar11111111110.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1111111119 = r69Var.a;
                                                                                                return resources1111111119.getString(2131958634, resources1111111119.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                it6 = listW1.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        mmr0Var = (mmr0) it6.next();
                                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                        }
                                                                    } else {
                                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                        it7 = arrayList2.iterator();
                                                                        do {
                                                                            if (it7.hasNext()) {
                                                                                next = it7.next();
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                            z69Var2 = (z69) next;
                                                                            if (z69Var2 != null) {
                                                                                f79Var2 = z69Var2.b;
                                                                                if (f79Var2 instanceof d79) {
                                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                } else if (f79Var2 instanceof e79) {
                                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar11111111111 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar11111111111.a, i4, hvzVar11111111111.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources11111111110 = r69Var.a;
                                                                                        return resources11111111110.getString(2131958634, resources11111111110.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (z3) {
                                                                                o69Var = (o69) h79Var;
                                                                                if (dN <= 0.0d) {
                                                                                    dValueOf3 = null;
                                                                                } else {
                                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                        dValueOf3 = null;
                                                                                    }
                                                                                }
                                                                                if (dValueOf3 != null) {
                                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar11111111112 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar11111111112.a, i4, hvzVar11111111112.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources11111111111 = r69Var.a;
                                                                                        return resources11111111111.getString(2131958634, resources11111111111.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (h79Var instanceof y69) {
                                                                                ArrayList arrayList1111 = ((y69) h79Var).a;
                                                                                it8 = arrayList1111.iterator();
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        next2 = it8.next();
                                                                                        i3 = i2 + 1;
                                                                                        if (i2 >= 0) {
                                                                                            p7h.T();
                                                                                            throw null;
                                                                                        }
                                                                                        x69 x69Var118 = (x69) next2;
                                                                                        d10 = x69Var118.a;
                                                                                        double d1111112 = x69Var118.b;
                                                                                        if (dN >= d10) {
                                                                                        }
                                                                                        i2 = i3;
                                                                                    } else {
                                                                                        next2 = null;
                                                                                    }
                                                                                }
                                                                                x69Var = (x69) next2;
                                                                                if (x69Var != null) {
                                                                                    double d1111113 = x69Var.a;
                                                                                    dPow = (dN - d1111113) / (x69Var.b - d1111113);
                                                                                    w69Var2 = x69Var.f;
                                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                                        if (w69Var2 instanceof u69) {
                                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                        } else if (w69Var2 instanceof v69) {
                                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i111113 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i111113);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar11111111113 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar11111111113.a, i4, hvzVar11111111113.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources11111111112 = r69Var.a;
                                                                                                    return resources11111111112.getString(2131958634, resources11111111112.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i111114 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i111114);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar11111111114 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar11111111114.a, i4, hvzVar11111111114.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources11111111113 = r69Var.a;
                                                                                                    return resources11111111113.getString(2131958634, resources11111111113.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                        } while (!g0p1.A((z69) next, dN));
                                                                        z69Var2 = (z69) next;
                                                                        if (z69Var2 != null) {
                                                                            f79Var2 = z69Var2.b;
                                                                            if (f79Var2 instanceof d79) {
                                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                            } else if (f79Var2 instanceof e79) {
                                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar11111111115 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar11111111115.a, i4, hvzVar11111111115.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources11111111114 = r69Var.a;
                                                                                    return resources11111111114.getString(2131958634, resources11111111114.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (z3) {
                                                                            o69Var = (o69) h79Var;
                                                                            if (dN <= 0.0d) {
                                                                                dValueOf3 = null;
                                                                            } else {
                                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                    dValueOf3 = null;
                                                                                }
                                                                            }
                                                                            if (dValueOf3 != null) {
                                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar11111111116 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar11111111116.a, i4, hvzVar11111111116.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources11111111115 = r69Var.a;
                                                                                    return resources11111111115.getString(2131958634, resources11111111115.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (h79Var instanceof y69) {
                                                                            ArrayList arrayList1112 = ((y69) h79Var).a;
                                                                            it8 = arrayList1112.iterator();
                                                                            i2 = 0;
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    next2 = it8.next();
                                                                                    i3 = i2 + 1;
                                                                                    if (i2 >= 0) {
                                                                                        p7h.T();
                                                                                        throw null;
                                                                                    }
                                                                                    x69 x69Var119 = (x69) next2;
                                                                                    d10 = x69Var119.a;
                                                                                    double d1111114 = x69Var119.b;
                                                                                    if (dN >= d10) {
                                                                                    }
                                                                                    i2 = i3;
                                                                                } else {
                                                                                    next2 = null;
                                                                                }
                                                                            }
                                                                            x69Var = (x69) next2;
                                                                            if (x69Var != null) {
                                                                                double d1111115 = x69Var.a;
                                                                                dPow = (dN - d1111115) / (x69Var.b - d1111115);
                                                                                w69Var2 = x69Var.f;
                                                                                if (u890.j(w69Var2, t69Var)) {
                                                                                    if (w69Var2 instanceof u69) {
                                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                    } else if (w69Var2 instanceof v69) {
                                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i111115 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i111115);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar11111111117 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar11111111117.a, i4, hvzVar11111111117.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11111111116 = r69Var.a;
                                                                                                return resources11111111116.getString(2131958634, resources11111111116.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i111116 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i111116);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar11111111118 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar11111111118.a, i4, hvzVar11111111118.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11111111117 = r69Var.a;
                                                                                                return resources11111111117.getString(2131958634, resources11111111117.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        it5 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                x69 x69Var120 = (x69) it5.next();
                                                                d5 = x69Var120.a;
                                                                z2 = z;
                                                                arrayList4 = arrayList3;
                                                                double d28 = x69Var120.c;
                                                                double d29 = x69Var120.b;
                                                                double d210 = x69Var120.d;
                                                                if (Math.abs(d5) > Double.MAX_VALUE) {
                                                                }
                                                            } else {
                                                                z3 = z;
                                                                arrayList5 = arrayList3;
                                                                if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                                                    listW1 = o7h.w1(arrayList5);
                                                                    if (listW1 instanceof Collection) {
                                                                        it6 = listW1.iterator();
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                mmr0Var = (mmr0) it6.next();
                                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                                }
                                                                            } else {
                                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                                it7 = arrayList2.iterator();
                                                                                do {
                                                                                    if (it7.hasNext()) {
                                                                                        next = it7.next();
                                                                                    } else {
                                                                                        next = null;
                                                                                    }
                                                                                    z69Var2 = (z69) next;
                                                                                    if (z69Var2 != null) {
                                                                                        f79Var2 = z69Var2.b;
                                                                                        if (f79Var2 instanceof d79) {
                                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                        } else if (f79Var2 instanceof e79) {
                                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar11111111119 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar11111111119.a, i4, hvzVar11111111119.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11111111118 = r69Var.a;
                                                                                                return resources11111111118.getString(2131958634, resources11111111118.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (z3) {
                                                                                        o69Var = (o69) h79Var;
                                                                                        if (dN <= 0.0d) {
                                                                                            dValueOf3 = null;
                                                                                        } else {
                                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                                dValueOf3 = null;
                                                                                            }
                                                                                        }
                                                                                        if (dValueOf3 != null) {
                                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111110 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111110.a, i4, hvzVar111111111110.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11111111119 = r69Var.a;
                                                                                                return resources11111111119.getString(2131958634, resources11111111119.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (h79Var instanceof y69) {
                                                                                        ArrayList arrayList1113 = ((y69) h79Var).a;
                                                                                        it8 = arrayList1113.iterator();
                                                                                        i2 = 0;
                                                                                        while (true) {
                                                                                            if (it8.hasNext()) {
                                                                                                next2 = it8.next();
                                                                                                i3 = i2 + 1;
                                                                                                if (i2 >= 0) {
                                                                                                    p7h.T();
                                                                                                    throw null;
                                                                                                }
                                                                                                x69 x69Var1110 = (x69) next2;
                                                                                                d10 = x69Var1110.a;
                                                                                                double d1111116 = x69Var1110.b;
                                                                                                if (dN >= d10) {
                                                                                                }
                                                                                                i2 = i3;
                                                                                            } else {
                                                                                                next2 = null;
                                                                                            }
                                                                                        }
                                                                                        x69Var = (x69) next2;
                                                                                        if (x69Var != null) {
                                                                                            double d1111117 = x69Var.a;
                                                                                            dPow = (dN - d1111117) / (x69Var.b - d1111117);
                                                                                            w69Var2 = x69Var.f;
                                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                                if (w69Var2 instanceof u69) {
                                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                                } else if (w69Var2 instanceof v69) {
                                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i111117 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i111117);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar111111111111 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar111111111111.a, i4, hvzVar111111111111.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources111111111110 = r69Var.a;
                                                                                                            return resources111111111110.getString(2131958634, resources111111111110.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i111118 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i111118);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar111111111112 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar111111111112.a, i4, hvzVar111111111112.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources111111111111 = r69Var.a;
                                                                                                            return resources111111111111.getString(2131958634, resources111111111111.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                } while (!g0p1.A((z69) next, dN));
                                                                                z69Var2 = (z69) next;
                                                                                if (z69Var2 != null) {
                                                                                    f79Var2 = z69Var2.b;
                                                                                    if (f79Var2 instanceof d79) {
                                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                    } else if (f79Var2 instanceof e79) {
                                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar111111111113 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar111111111113.a, i4, hvzVar111111111113.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources111111111112 = r69Var.a;
                                                                                            return resources111111111112.getString(2131958634, resources111111111112.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (z3) {
                                                                                    o69Var = (o69) h79Var;
                                                                                    if (dN <= 0.0d) {
                                                                                        dValueOf3 = null;
                                                                                    } else {
                                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                            dValueOf3 = null;
                                                                                        }
                                                                                    }
                                                                                    if (dValueOf3 != null) {
                                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar111111111114 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar111111111114.a, i4, hvzVar111111111114.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources111111111113 = r69Var.a;
                                                                                            return resources111111111113.getString(2131958634, resources111111111113.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (h79Var instanceof y69) {
                                                                                    ArrayList arrayList1114 = ((y69) h79Var).a;
                                                                                    it8 = arrayList1114.iterator();
                                                                                    i2 = 0;
                                                                                    while (true) {
                                                                                        if (it8.hasNext()) {
                                                                                            next2 = it8.next();
                                                                                            i3 = i2 + 1;
                                                                                            if (i2 >= 0) {
                                                                                                p7h.T();
                                                                                                throw null;
                                                                                            }
                                                                                            x69 x69Var1111 = (x69) next2;
                                                                                            d10 = x69Var1111.a;
                                                                                            double d1111118 = x69Var1111.b;
                                                                                            if (dN >= d10) {
                                                                                            }
                                                                                            i2 = i3;
                                                                                        } else {
                                                                                            next2 = null;
                                                                                        }
                                                                                    }
                                                                                    x69Var = (x69) next2;
                                                                                    if (x69Var != null) {
                                                                                        double d1111119 = x69Var.a;
                                                                                        dPow = (dN - d1111119) / (x69Var.b - d1111119);
                                                                                        w69Var2 = x69Var.f;
                                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                                            if (w69Var2 instanceof u69) {
                                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                            } else if (w69Var2 instanceof v69) {
                                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i111119 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i111119);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar111111111115 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar111111111115.a, i4, hvzVar111111111115.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources111111111114 = r69Var.a;
                                                                                                        return resources111111111114.getString(2131958634, resources111111111114.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i1111110 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i1111110);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar111111111116 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar111111111116.a, i4, hvzVar111111111116.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources111111111115 = r69Var.a;
                                                                                                        return resources111111111115.getString(2131958634, resources111111111115.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        it6 = listW1.iterator();
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                mmr0Var = (mmr0) it6.next();
                                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                                }
                                                                            } else {
                                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                                it7 = arrayList2.iterator();
                                                                                do {
                                                                                    if (it7.hasNext()) {
                                                                                        next = it7.next();
                                                                                    } else {
                                                                                        next = null;
                                                                                    }
                                                                                    z69Var2 = (z69) next;
                                                                                    if (z69Var2 != null) {
                                                                                        f79Var2 = z69Var2.b;
                                                                                        if (f79Var2 instanceof d79) {
                                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                        } else if (f79Var2 instanceof e79) {
                                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111117 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111117.a, i4, hvzVar111111111117.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources111111111116 = r69Var.a;
                                                                                                return resources111111111116.getString(2131958634, resources111111111116.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (z3) {
                                                                                        o69Var = (o69) h79Var;
                                                                                        if (dN <= 0.0d) {
                                                                                            dValueOf3 = null;
                                                                                        } else {
                                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                                dValueOf3 = null;
                                                                                            }
                                                                                        }
                                                                                        if (dValueOf3 != null) {
                                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111118 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111118.a, i4, hvzVar111111111118.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources111111111117 = r69Var.a;
                                                                                                return resources111111111117.getString(2131958634, resources111111111117.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (h79Var instanceof y69) {
                                                                                        ArrayList arrayList1115 = ((y69) h79Var).a;
                                                                                        it8 = arrayList1115.iterator();
                                                                                        i2 = 0;
                                                                                        while (true) {
                                                                                            if (it8.hasNext()) {
                                                                                                next2 = it8.next();
                                                                                                i3 = i2 + 1;
                                                                                                if (i2 >= 0) {
                                                                                                    p7h.T();
                                                                                                    throw null;
                                                                                                }
                                                                                                x69 x69Var1112 = (x69) next2;
                                                                                                d10 = x69Var1112.a;
                                                                                                double d11111110 = x69Var1112.b;
                                                                                                if (dN >= d10) {
                                                                                                }
                                                                                                i2 = i3;
                                                                                            } else {
                                                                                                next2 = null;
                                                                                            }
                                                                                        }
                                                                                        x69Var = (x69) next2;
                                                                                        if (x69Var != null) {
                                                                                            double d11111111 = x69Var.a;
                                                                                            dPow = (dN - d11111111) / (x69Var.b - d11111111);
                                                                                            w69Var2 = x69Var.f;
                                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                                if (w69Var2 instanceof u69) {
                                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                                } else if (w69Var2 instanceof v69) {
                                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i1111111 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i1111111);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar111111111119 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar111111111119.a, i4, hvzVar111111111119.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources111111111118 = r69Var.a;
                                                                                                            return resources111111111118.getString(2131958634, resources111111111118.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i1111112 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i1111112);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar1111111111110 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar1111111111110.a, i4, hvzVar1111111111110.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources111111111119 = r69Var.a;
                                                                                                            return resources111111111119.getString(2131958634, resources111111111119.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                } while (!g0p1.A((z69) next, dN));
                                                                                z69Var2 = (z69) next;
                                                                                if (z69Var2 != null) {
                                                                                    f79Var2 = z69Var2.b;
                                                                                    if (f79Var2 instanceof d79) {
                                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                    } else if (f79Var2 instanceof e79) {
                                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar1111111111111 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar1111111111111.a, i4, hvzVar1111111111111.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources1111111111110 = r69Var.a;
                                                                                            return resources1111111111110.getString(2131958634, resources1111111111110.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (z3) {
                                                                                    o69Var = (o69) h79Var;
                                                                                    if (dN <= 0.0d) {
                                                                                        dValueOf3 = null;
                                                                                    } else {
                                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                            dValueOf3 = null;
                                                                                        }
                                                                                    }
                                                                                    if (dValueOf3 != null) {
                                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar1111111111112 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar1111111111112.a, i4, hvzVar1111111111112.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources1111111111111 = r69Var.a;
                                                                                            return resources1111111111111.getString(2131958634, resources1111111111111.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (h79Var instanceof y69) {
                                                                                    ArrayList arrayList1116 = ((y69) h79Var).a;
                                                                                    it8 = arrayList1116.iterator();
                                                                                    i2 = 0;
                                                                                    while (true) {
                                                                                        if (it8.hasNext()) {
                                                                                            next2 = it8.next();
                                                                                            i3 = i2 + 1;
                                                                                            if (i2 >= 0) {
                                                                                                p7h.T();
                                                                                                throw null;
                                                                                            }
                                                                                            x69 x69Var1113 = (x69) next2;
                                                                                            d10 = x69Var1113.a;
                                                                                            double d11111112 = x69Var1113.b;
                                                                                            if (dN >= d10) {
                                                                                            }
                                                                                            i2 = i3;
                                                                                        } else {
                                                                                            next2 = null;
                                                                                        }
                                                                                    }
                                                                                    x69Var = (x69) next2;
                                                                                    if (x69Var != null) {
                                                                                        double d11111113 = x69Var.a;
                                                                                        dPow = (dN - d11111113) / (x69Var.b - d11111113);
                                                                                        w69Var2 = x69Var.f;
                                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                                            if (w69Var2 instanceof u69) {
                                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                            } else if (w69Var2 instanceof v69) {
                                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i1111113 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i1111113);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar1111111111113 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar1111111111113.a, i4, hvzVar1111111111113.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources1111111111112 = r69Var.a;
                                                                                                        return resources1111111111112.getString(2131958634, resources1111111111112.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i1111114 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i1111114);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar1111111111114 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar1111111111114.a, i4, hvzVar1111111111114.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources1111111111113 = r69Var.a;
                                                                                                        return resources1111111111113.getString(2131958634, resources1111111111113.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z = z2;
                                                            arrayList3 = arrayList4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                eg.o();
                                            }
                                        }
                                    }
                                } else {
                                    it = collectionK.iterator();
                                    while (true) {
                                        if (((sr80) it).c) {
                                            iNextInt = ((lr80) it).nextInt();
                                            collectionQ = yoi1.Q(iNextInt + 1, arrayList6.size());
                                            if (collectionQ instanceof Collection) {
                                                it2 = collectionQ.iterator();
                                                while (true) {
                                                    if (((sr80) it2).c) {
                                                        int iNextInt5 = ((lr80) it2).nextInt();
                                                        it3 = it;
                                                        z69 z69Var7 = (z69) arrayList6.get(iNextInt);
                                                        z69Var = (z69) arrayList6.get(iNextInt5);
                                                        c79Var = z69Var7.a;
                                                        arrayList = arrayList6;
                                                        if (c79Var instanceof a79) {
                                                            c79Var3 = z69Var.a;
                                                            if (c79Var3 instanceof a79) {
                                                                i = iNextInt;
                                                                if (((a79) c79Var).a == ((a79) c79Var3).a) {
                                                                }
                                                                it4 = it2;
                                                                it = it3;
                                                                iNextInt = i;
                                                                it2 = it4;
                                                                arrayList6 = arrayList;
                                                                dDoubleValue2 = dDoubleValue2;
                                                            } else {
                                                                i = iNextInt;
                                                                if (c79Var3 instanceof b79) {
                                                                    d3 = ((a79) c79Var).a;
                                                                    b79Var4 = (b79) c79Var3;
                                                                    if (d3 > b79Var4.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        } else {
                                                            i = iNextInt;
                                                            if (c79Var instanceof b79) {
                                                                c79Var2 = z69Var.a;
                                                                if (c79Var2 instanceof a79) {
                                                                    d2 = ((a79) c79Var2).a;
                                                                    b79Var3 = (b79) c79Var;
                                                                    if (d2 > b79Var3.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else if (c79Var2 instanceof b79) {
                                                                    b79Var = (b79) c79Var;
                                                                    b79Var2 = (b79) c79Var2;
                                                                    it4 = it2;
                                                                    if (Math.max(b79Var.a, b79Var2.a) >= Math.min(b79Var.b, b79Var2.b)) {
                                                                        it = it3;
                                                                        iNextInt = i;
                                                                        it2 = it4;
                                                                        arrayList6 = arrayList;
                                                                        dDoubleValue2 = dDoubleValue2;
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        }
                                                    } else {
                                                        it = it;
                                                        arrayList6 = arrayList6;
                                                        dDoubleValue2 = dDoubleValue2;
                                                    }
                                                }
                                            } else {
                                                it2 = collectionQ.iterator();
                                                while (true) {
                                                    if (((sr80) it2).c) {
                                                        int iNextInt6 = ((lr80) it2).nextInt();
                                                        it3 = it;
                                                        z69 z69Var8 = (z69) arrayList6.get(iNextInt);
                                                        z69Var = (z69) arrayList6.get(iNextInt6);
                                                        c79Var = z69Var8.a;
                                                        arrayList = arrayList6;
                                                        if (c79Var instanceof a79) {
                                                            c79Var3 = z69Var.a;
                                                            if (c79Var3 instanceof a79) {
                                                                i = iNextInt;
                                                                if (((a79) c79Var).a == ((a79) c79Var3).a) {
                                                                }
                                                                it4 = it2;
                                                                it = it3;
                                                                iNextInt = i;
                                                                it2 = it4;
                                                                arrayList6 = arrayList;
                                                                dDoubleValue2 = dDoubleValue2;
                                                            } else {
                                                                i = iNextInt;
                                                                if (c79Var3 instanceof b79) {
                                                                    d3 = ((a79) c79Var).a;
                                                                    b79Var4 = (b79) c79Var3;
                                                                    if (d3 > b79Var4.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            }
                                                        } else {
                                                            i = iNextInt;
                                                            if (c79Var instanceof b79) {
                                                                c79Var2 = z69Var.a;
                                                                if (c79Var2 instanceof a79) {
                                                                    d2 = ((a79) c79Var2).a;
                                                                    b79Var3 = (b79) c79Var;
                                                                    if (d2 > b79Var3.a) {
                                                                    }
                                                                    it4 = it2;
                                                                    it = it3;
                                                                    iNextInt = i;
                                                                    it2 = it4;
                                                                    arrayList6 = arrayList;
                                                                    dDoubleValue2 = dDoubleValue2;
                                                                } else if (c79Var2 instanceof b79) {
                                                                    b79Var = (b79) c79Var;
                                                                    b79Var2 = (b79) c79Var2;
                                                                    it4 = it2;
                                                                    if (Math.max(b79Var.a, b79Var2.a) >= Math.min(b79Var.b, b79Var2.b)) {
                                                                        it = it3;
                                                                        iNextInt = i;
                                                                        it2 = it4;
                                                                        arrayList6 = arrayList;
                                                                        dDoubleValue2 = dDoubleValue2;
                                                                    }
                                                                } else {
                                                                    eg.o();
                                                                }
                                                            } else {
                                                                eg.o();
                                                            }
                                                        }
                                                    } else {
                                                        it = it;
                                                        arrayList6 = arrayList6;
                                                        dDoubleValue2 = dDoubleValue2;
                                                    }
                                                }
                                            }
                                            if (ivzVar instanceof hvz) {
                                                hvz hvzVar1111111111115 = (hvz) ivzVar;
                                                return r69Var.a(hvzVar1111111111115.a, i4, hvzVar1111111111115.b);
                                            }
                                            if (ivzVar instanceof ivz) {
                                                iC = l1d.C(((ivz) ivzVar).a);
                                                if (iC != 0) {
                                                    if (iC != 1) {
                                                        if (i4 != 2) {
                                                        }
                                                        return r69Var.a(0.0d, i4, 1);
                                                    }
                                                    if (iC != 2) {
                                                    }
                                                    Resources resources1111111111114 = r69Var.a;
                                                    return resources1111111111114.getString(2131958634, resources1111111111114.getString(2131958641));
                                                }
                                                if (i4 == 2) {
                                                    return r69Var.a(0.0d, i4, 1);
                                                }
                                            } else if (ivzVar != null) {
                                                eg.o();
                                            }
                                        } else {
                                            arrayList2 = arrayList6;
                                            d4 = dDoubleValue2;
                                            z = h79Var instanceof o69;
                                            if (z) {
                                                o69 o69Var5 = (o69) h79Var;
                                                d11 = o69Var5.a;
                                                if (Math.abs(d11) <= Double.MAX_VALUE) {
                                                    if (d13 <= 0.0d) {
                                                        if (!arrayList2.isEmpty()) {
                                                            it9 = arrayList2.iterator();
                                                            while (true) {
                                                                if (!it9.hasNext()) {
                                                                    if (g0p1.A((z69) it9.next(), d)) {
                                                                        d = 0.0d;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z3 = z;
                                                    dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                    it7 = arrayList2.iterator();
                                                    do {
                                                        if (it7.hasNext()) {
                                                            next = it7.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        z69Var2 = (z69) next;
                                                        if (z69Var2 != null) {
                                                            f79Var2 = z69Var2.b;
                                                            if (f79Var2 instanceof d79) {
                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                            } else if (f79Var2 instanceof e79) {
                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                            } else {
                                                                eg.o();
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar1111111111116 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar1111111111116.a, i4, hvzVar1111111111116.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources1111111111115 = r69Var.a;
                                                                    return resources1111111111115.getString(2131958634, resources1111111111115.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (z3) {
                                                            o69Var = (o69) h79Var;
                                                            if (dN <= 0.0d) {
                                                                dValueOf3 = null;
                                                            } else {
                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                    dValueOf3 = null;
                                                                }
                                                            }
                                                            if (dValueOf3 != null) {
                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                ivzVar = hvzVar;
                                                            }
                                                            if (ivzVar instanceof hvz) {
                                                                hvz hvzVar1111111111117 = (hvz) ivzVar;
                                                                return r69Var.a(hvzVar1111111111117.a, i4, hvzVar1111111111117.b);
                                                            }
                                                            if (ivzVar instanceof ivz) {
                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                if (iC != 0) {
                                                                    if (iC != 1) {
                                                                        if (i4 != 2) {
                                                                        }
                                                                        return r69Var.a(0.0d, i4, 1);
                                                                    }
                                                                    if (iC != 2) {
                                                                    }
                                                                    Resources resources1111111111116 = r69Var.a;
                                                                    return resources1111111111116.getString(2131958634, resources1111111111116.getString(2131958641));
                                                                }
                                                                if (i4 == 2) {
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                            } else if (ivzVar != null) {
                                                                eg.o();
                                                            }
                                                        } else if (h79Var instanceof y69) {
                                                            ArrayList arrayList1117 = ((y69) h79Var).a;
                                                            it8 = arrayList1117.iterator();
                                                            i2 = 0;
                                                            while (true) {
                                                                if (it8.hasNext()) {
                                                                    next2 = it8.next();
                                                                    i3 = i2 + 1;
                                                                    if (i2 >= 0) {
                                                                        p7h.T();
                                                                        throw null;
                                                                    }
                                                                    x69 x69Var1114 = (x69) next2;
                                                                    d10 = x69Var1114.a;
                                                                    double d11111114 = x69Var1114.b;
                                                                    if (dN >= d10) {
                                                                    }
                                                                    i2 = i3;
                                                                } else {
                                                                    next2 = null;
                                                                }
                                                            }
                                                            x69Var = (x69) next2;
                                                            if (x69Var != null) {
                                                                double d11111115 = x69Var.a;
                                                                dPow = (dN - d11111115) / (x69Var.b - d11111115);
                                                                w69Var2 = x69Var.f;
                                                                if (u890.j(w69Var2, t69Var)) {
                                                                    if (w69Var2 instanceof u69) {
                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                    } else if (w69Var2 instanceof v69) {
                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i1111115 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i1111115);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar1111111111118 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar1111111111118.a, i4, hvzVar1111111111118.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources1111111111117 = r69Var.a;
                                                                                return resources1111111111117.getString(2131958634, resources1111111111117.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                } else {
                                                                    dValueOf = Double.valueOf(dPow);
                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                        dValueOf = null;
                                                                    }
                                                                    if (dValueOf != null) {
                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                        int i1111116 = x69Var.e;
                                                                        d8 = x69Var.d;
                                                                        d9 = x69Var.c;
                                                                        iC2 = l1d.C(i1111116);
                                                                        if (iC2 != 0) {
                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                        } else if (iC2 == 1) {
                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                            dValueOf2 = null;
                                                                        }
                                                                        if (dValueOf2 != null) {
                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                            ivzVar = hvzVar;
                                                                        }
                                                                        if (ivzVar instanceof hvz) {
                                                                            hvz hvzVar1111111111119 = (hvz) ivzVar;
                                                                            return r69Var.a(hvzVar1111111111119.a, i4, hvzVar1111111111119.b);
                                                                        }
                                                                        if (ivzVar instanceof ivz) {
                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                            if (iC != 0) {
                                                                                if (iC != 1) {
                                                                                    if (i4 != 2) {
                                                                                    }
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                                if (iC != 2) {
                                                                                }
                                                                                Resources resources1111111111118 = r69Var.a;
                                                                                return resources1111111111118.getString(2131958634, resources1111111111118.getString(2131958641));
                                                                            }
                                                                            if (i4 == 2) {
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                        } else if (ivzVar != null) {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            eg.o();
                                                        }
                                                    } while (!g0p1.A((z69) next, dN));
                                                    z69Var2 = (z69) next;
                                                    if (z69Var2 != null) {
                                                        f79Var2 = z69Var2.b;
                                                        if (f79Var2 instanceof d79) {
                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                        } else if (f79Var2 instanceof e79) {
                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                        } else {
                                                            eg.o();
                                                        }
                                                        if (ivzVar instanceof hvz) {
                                                            hvz hvzVar11111111111110 = (hvz) ivzVar;
                                                            return r69Var.a(hvzVar11111111111110.a, i4, hvzVar11111111111110.b);
                                                        }
                                                        if (ivzVar instanceof ivz) {
                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                            if (iC != 0) {
                                                                if (iC != 1) {
                                                                    if (i4 != 2) {
                                                                    }
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                                if (iC != 2) {
                                                                }
                                                                Resources resources1111111111119 = r69Var.a;
                                                                return resources1111111111119.getString(2131958634, resources1111111111119.getString(2131958641));
                                                            }
                                                            if (i4 == 2) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (ivzVar != null) {
                                                            eg.o();
                                                        }
                                                    } else if (z3) {
                                                        o69Var = (o69) h79Var;
                                                        if (dN <= 0.0d) {
                                                            dValueOf3 = null;
                                                        } else {
                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                            dValueOf3 = Double.valueOf(dLog10);
                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                dValueOf3 = null;
                                                            }
                                                        }
                                                        if (dValueOf3 != null) {
                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                            ivzVar = hvzVar;
                                                        }
                                                        if (ivzVar instanceof hvz) {
                                                            hvz hvzVar11111111111111 = (hvz) ivzVar;
                                                            return r69Var.a(hvzVar11111111111111.a, i4, hvzVar11111111111111.b);
                                                        }
                                                        if (ivzVar instanceof ivz) {
                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                            if (iC != 0) {
                                                                if (iC != 1) {
                                                                    if (i4 != 2) {
                                                                    }
                                                                    return r69Var.a(0.0d, i4, 1);
                                                                }
                                                                if (iC != 2) {
                                                                }
                                                                Resources resources11111111111110 = r69Var.a;
                                                                return resources11111111111110.getString(2131958634, resources11111111111110.getString(2131958641));
                                                            }
                                                            if (i4 == 2) {
                                                                return r69Var.a(0.0d, i4, 1);
                                                            }
                                                        } else if (ivzVar != null) {
                                                            eg.o();
                                                        }
                                                    } else if (h79Var instanceof y69) {
                                                        ArrayList arrayList1118 = ((y69) h79Var).a;
                                                        it8 = arrayList1118.iterator();
                                                        i2 = 0;
                                                        while (true) {
                                                            if (it8.hasNext()) {
                                                                next2 = it8.next();
                                                                i3 = i2 + 1;
                                                                if (i2 >= 0) {
                                                                    p7h.T();
                                                                    throw null;
                                                                }
                                                                x69 x69Var1115 = (x69) next2;
                                                                d10 = x69Var1115.a;
                                                                double d11111116 = x69Var1115.b;
                                                                if (dN >= d10) {
                                                                }
                                                                i2 = i3;
                                                            } else {
                                                                next2 = null;
                                                            }
                                                        }
                                                        x69Var = (x69) next2;
                                                        if (x69Var != null) {
                                                            double d11111117 = x69Var.a;
                                                            dPow = (dN - d11111117) / (x69Var.b - d11111117);
                                                            w69Var2 = x69Var.f;
                                                            if (u890.j(w69Var2, t69Var)) {
                                                                if (w69Var2 instanceof u69) {
                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                } else if (w69Var2 instanceof v69) {
                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                } else {
                                                                    eg.o();
                                                                }
                                                                dValueOf = Double.valueOf(dPow);
                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                    dValueOf = null;
                                                                }
                                                                if (dValueOf != null) {
                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                    int i1111117 = x69Var.e;
                                                                    d8 = x69Var.d;
                                                                    d9 = x69Var.c;
                                                                    iC2 = l1d.C(i1111117);
                                                                    if (iC2 != 0) {
                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                    } else if (iC2 == 1) {
                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                        dValueOf2 = null;
                                                                    }
                                                                    if (dValueOf2 != null) {
                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar11111111111112 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar11111111111112.a, i4, hvzVar11111111111112.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources11111111111111 = r69Var.a;
                                                                            return resources11111111111111.getString(2131958634, resources11111111111111.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                }
                                                            } else {
                                                                dValueOf = Double.valueOf(dPow);
                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                    dValueOf = null;
                                                                }
                                                                if (dValueOf != null) {
                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                    int i1111118 = x69Var.e;
                                                                    d8 = x69Var.d;
                                                                    d9 = x69Var.c;
                                                                    iC2 = l1d.C(i1111118);
                                                                    if (iC2 != 0) {
                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                    } else if (iC2 == 1) {
                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                    } else {
                                                                        eg.o();
                                                                    }
                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                        dValueOf2 = null;
                                                                    }
                                                                    if (dValueOf2 != null) {
                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                        ivzVar = hvzVar;
                                                                    }
                                                                    if (ivzVar instanceof hvz) {
                                                                        hvz hvzVar11111111111113 = (hvz) ivzVar;
                                                                        return r69Var.a(hvzVar11111111111113.a, i4, hvzVar11111111111113.b);
                                                                    }
                                                                    if (ivzVar instanceof ivz) {
                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                        if (iC != 0) {
                                                                            if (iC != 1) {
                                                                                if (i4 != 2) {
                                                                                }
                                                                                return r69Var.a(0.0d, i4, 1);
                                                                            }
                                                                            if (iC != 2) {
                                                                            }
                                                                            Resources resources11111111111112 = r69Var.a;
                                                                            return resources11111111111112.getString(2131958634, resources11111111111112.getString(2131958641));
                                                                        }
                                                                        if (i4 == 2) {
                                                                            return r69Var.a(0.0d, i4, 1);
                                                                        }
                                                                    } else if (ivzVar != null) {
                                                                        eg.o();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        eg.o();
                                                    }
                                                }
                                            } else if (h79Var instanceof y69) {
                                                arrayList3 = ((y69) h79Var).a;
                                                if (!arrayList3.isEmpty()) {
                                                    if (arrayList3.isEmpty()) {
                                                        z3 = z;
                                                        arrayList5 = arrayList3;
                                                        if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                                            listW1 = o7h.w1(arrayList5);
                                                            if (listW1 instanceof Collection) {
                                                                it6 = listW1.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        mmr0Var = (mmr0) it6.next();
                                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                        }
                                                                    } else {
                                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                        it7 = arrayList2.iterator();
                                                                        do {
                                                                            if (it7.hasNext()) {
                                                                                next = it7.next();
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                            z69Var2 = (z69) next;
                                                                            if (z69Var2 != null) {
                                                                                f79Var2 = z69Var2.b;
                                                                                if (f79Var2 instanceof d79) {
                                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                } else if (f79Var2 instanceof e79) {
                                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar11111111111114 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar11111111111114.a, i4, hvzVar11111111111114.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources11111111111113 = r69Var.a;
                                                                                        return resources11111111111113.getString(2131958634, resources11111111111113.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (z3) {
                                                                                o69Var = (o69) h79Var;
                                                                                if (dN <= 0.0d) {
                                                                                    dValueOf3 = null;
                                                                                } else {
                                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                        dValueOf3 = null;
                                                                                    }
                                                                                }
                                                                                if (dValueOf3 != null) {
                                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar11111111111115 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar11111111111115.a, i4, hvzVar11111111111115.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources11111111111114 = r69Var.a;
                                                                                        return resources11111111111114.getString(2131958634, resources11111111111114.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (h79Var instanceof y69) {
                                                                                ArrayList arrayList1119 = ((y69) h79Var).a;
                                                                                it8 = arrayList1119.iterator();
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        next2 = it8.next();
                                                                                        i3 = i2 + 1;
                                                                                        if (i2 >= 0) {
                                                                                            p7h.T();
                                                                                            throw null;
                                                                                        }
                                                                                        x69 x69Var1116 = (x69) next2;
                                                                                        d10 = x69Var1116.a;
                                                                                        double d11111118 = x69Var1116.b;
                                                                                        if (dN >= d10) {
                                                                                        }
                                                                                        i2 = i3;
                                                                                    } else {
                                                                                        next2 = null;
                                                                                    }
                                                                                }
                                                                                x69Var = (x69) next2;
                                                                                if (x69Var != null) {
                                                                                    double d11111119 = x69Var.a;
                                                                                    dPow = (dN - d11111119) / (x69Var.b - d11111119);
                                                                                    w69Var2 = x69Var.f;
                                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                                        if (w69Var2 instanceof u69) {
                                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                        } else if (w69Var2 instanceof v69) {
                                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i1111119 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i1111119);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar11111111111116 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar11111111111116.a, i4, hvzVar11111111111116.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources11111111111115 = r69Var.a;
                                                                                                    return resources11111111111115.getString(2131958634, resources11111111111115.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i11111110 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i11111110);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar11111111111117 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar11111111111117.a, i4, hvzVar11111111111117.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources11111111111116 = r69Var.a;
                                                                                                    return resources11111111111116.getString(2131958634, resources11111111111116.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                        } while (!g0p1.A((z69) next, dN));
                                                                        z69Var2 = (z69) next;
                                                                        if (z69Var2 != null) {
                                                                            f79Var2 = z69Var2.b;
                                                                            if (f79Var2 instanceof d79) {
                                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                            } else if (f79Var2 instanceof e79) {
                                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar11111111111118 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar11111111111118.a, i4, hvzVar11111111111118.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources11111111111117 = r69Var.a;
                                                                                    return resources11111111111117.getString(2131958634, resources11111111111117.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (z3) {
                                                                            o69Var = (o69) h79Var;
                                                                            if (dN <= 0.0d) {
                                                                                dValueOf3 = null;
                                                                            } else {
                                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                    dValueOf3 = null;
                                                                                }
                                                                            }
                                                                            if (dValueOf3 != null) {
                                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar11111111111119 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar11111111111119.a, i4, hvzVar11111111111119.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources11111111111118 = r69Var.a;
                                                                                    return resources11111111111118.getString(2131958634, resources11111111111118.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (h79Var instanceof y69) {
                                                                            ArrayList arrayList11110 = ((y69) h79Var).a;
                                                                            it8 = arrayList11110.iterator();
                                                                            i2 = 0;
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    next2 = it8.next();
                                                                                    i3 = i2 + 1;
                                                                                    if (i2 >= 0) {
                                                                                        p7h.T();
                                                                                        throw null;
                                                                                    }
                                                                                    x69 x69Var1117 = (x69) next2;
                                                                                    d10 = x69Var1117.a;
                                                                                    double d111111110 = x69Var1117.b;
                                                                                    if (dN >= d10) {
                                                                                    }
                                                                                    i2 = i3;
                                                                                } else {
                                                                                    next2 = null;
                                                                                }
                                                                            }
                                                                            x69Var = (x69) next2;
                                                                            if (x69Var != null) {
                                                                                double d111111111 = x69Var.a;
                                                                                dPow = (dN - d111111111) / (x69Var.b - d111111111);
                                                                                w69Var2 = x69Var.f;
                                                                                if (u890.j(w69Var2, t69Var)) {
                                                                                    if (w69Var2 instanceof u69) {
                                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                    } else if (w69Var2 instanceof v69) {
                                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i11111111 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i11111111);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111111110 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111111110.a, i4, hvzVar111111111111110.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources11111111111119 = r69Var.a;
                                                                                                return resources11111111111119.getString(2131958634, resources11111111111119.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i11111112 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i11111112);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111111111 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111111111.a, i4, hvzVar111111111111111.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources111111111111110 = r69Var.a;
                                                                                                return resources111111111111110.getString(2131958634, resources111111111111110.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                it6 = listW1.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        mmr0Var = (mmr0) it6.next();
                                                                        if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                        }
                                                                    } else {
                                                                        dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                        it7 = arrayList2.iterator();
                                                                        do {
                                                                            if (it7.hasNext()) {
                                                                                next = it7.next();
                                                                            } else {
                                                                                next = null;
                                                                            }
                                                                            z69Var2 = (z69) next;
                                                                            if (z69Var2 != null) {
                                                                                f79Var2 = z69Var2.b;
                                                                                if (f79Var2 instanceof d79) {
                                                                                    ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                } else if (f79Var2 instanceof e79) {
                                                                                    ivzVar = new ivz(((e79) f79Var2).a);
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar111111111111112 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar111111111111112.a, i4, hvzVar111111111111112.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources111111111111111 = r69Var.a;
                                                                                        return resources111111111111111.getString(2131958634, resources111111111111111.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (z3) {
                                                                                o69Var = (o69) h79Var;
                                                                                if (dN <= 0.0d) {
                                                                                    dValueOf3 = null;
                                                                                } else {
                                                                                    dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                    dValueOf3 = Double.valueOf(dLog10);
                                                                                    if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                        dValueOf3 = null;
                                                                                    }
                                                                                }
                                                                                if (dValueOf3 != null) {
                                                                                    hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                    ivzVar = hvzVar;
                                                                                }
                                                                                if (ivzVar instanceof hvz) {
                                                                                    hvz hvzVar111111111111113 = (hvz) ivzVar;
                                                                                    return r69Var.a(hvzVar111111111111113.a, i4, hvzVar111111111111113.b);
                                                                                }
                                                                                if (ivzVar instanceof ivz) {
                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                    if (iC != 0) {
                                                                                        if (iC != 1) {
                                                                                            if (i4 != 2) {
                                                                                            }
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                        if (iC != 2) {
                                                                                        }
                                                                                        Resources resources111111111111112 = r69Var.a;
                                                                                        return resources111111111111112.getString(2131958634, resources111111111111112.getString(2131958641));
                                                                                    }
                                                                                    if (i4 == 2) {
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                } else if (ivzVar != null) {
                                                                                    eg.o();
                                                                                }
                                                                            } else if (h79Var instanceof y69) {
                                                                                ArrayList arrayList11111 = ((y69) h79Var).a;
                                                                                it8 = arrayList11111.iterator();
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (it8.hasNext()) {
                                                                                        next2 = it8.next();
                                                                                        i3 = i2 + 1;
                                                                                        if (i2 >= 0) {
                                                                                            p7h.T();
                                                                                            throw null;
                                                                                        }
                                                                                        x69 x69Var1118 = (x69) next2;
                                                                                        d10 = x69Var1118.a;
                                                                                        double d111111112 = x69Var1118.b;
                                                                                        if (dN >= d10) {
                                                                                        }
                                                                                        i2 = i3;
                                                                                    } else {
                                                                                        next2 = null;
                                                                                    }
                                                                                }
                                                                                x69Var = (x69) next2;
                                                                                if (x69Var != null) {
                                                                                    double d111111113 = x69Var.a;
                                                                                    dPow = (dN - d111111113) / (x69Var.b - d111111113);
                                                                                    w69Var2 = x69Var.f;
                                                                                    if (u890.j(w69Var2, t69Var)) {
                                                                                        if (w69Var2 instanceof u69) {
                                                                                            dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                        } else if (w69Var2 instanceof v69) {
                                                                                            dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i11111113 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i11111113);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar111111111111114 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar111111111111114.a, i4, hvzVar111111111111114.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources111111111111113 = r69Var.a;
                                                                                                    return resources111111111111113.getString(2131958634, resources111111111111113.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        dValueOf = Double.valueOf(dPow);
                                                                                        if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                            dValueOf = null;
                                                                                        }
                                                                                        if (dValueOf != null) {
                                                                                            dDoubleValue = dValueOf.doubleValue();
                                                                                            int i11111114 = x69Var.e;
                                                                                            d8 = x69Var.d;
                                                                                            d9 = x69Var.c;
                                                                                            iC2 = l1d.C(i11111114);
                                                                                            if (iC2 != 0) {
                                                                                                dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                            } else if (iC2 == 1) {
                                                                                                dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf2 = Double.valueOf(dPow2);
                                                                                            if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                dValueOf2 = null;
                                                                                            }
                                                                                            if (dValueOf2 != null) {
                                                                                                hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                ivzVar = hvzVar;
                                                                                            }
                                                                                            if (ivzVar instanceof hvz) {
                                                                                                hvz hvzVar111111111111115 = (hvz) ivzVar;
                                                                                                return r69Var.a(hvzVar111111111111115.a, i4, hvzVar111111111111115.b);
                                                                                            }
                                                                                            if (ivzVar instanceof ivz) {
                                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                                if (iC != 0) {
                                                                                                    if (iC != 1) {
                                                                                                        if (i4 != 2) {
                                                                                                        }
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                    if (iC != 2) {
                                                                                                    }
                                                                                                    Resources resources111111111111114 = r69Var.a;
                                                                                                    return resources111111111111114.getString(2131958634, resources111111111111114.getString(2131958641));
                                                                                                }
                                                                                                if (i4 == 2) {
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                            } else if (ivzVar != null) {
                                                                                                eg.o();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                        } while (!g0p1.A((z69) next, dN));
                                                                        z69Var2 = (z69) next;
                                                                        if (z69Var2 != null) {
                                                                            f79Var2 = z69Var2.b;
                                                                            if (f79Var2 instanceof d79) {
                                                                                ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                            } else if (f79Var2 instanceof e79) {
                                                                                ivzVar = new ivz(((e79) f79Var2).a);
                                                                            } else {
                                                                                eg.o();
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar111111111111116 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar111111111111116.a, i4, hvzVar111111111111116.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources111111111111115 = r69Var.a;
                                                                                    return resources111111111111115.getString(2131958634, resources111111111111115.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (z3) {
                                                                            o69Var = (o69) h79Var;
                                                                            if (dN <= 0.0d) {
                                                                                dValueOf3 = null;
                                                                            } else {
                                                                                dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                dValueOf3 = Double.valueOf(dLog10);
                                                                                if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                    dValueOf3 = null;
                                                                                }
                                                                            }
                                                                            if (dValueOf3 != null) {
                                                                                hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                ivzVar = hvzVar;
                                                                            }
                                                                            if (ivzVar instanceof hvz) {
                                                                                hvz hvzVar111111111111117 = (hvz) ivzVar;
                                                                                return r69Var.a(hvzVar111111111111117.a, i4, hvzVar111111111111117.b);
                                                                            }
                                                                            if (ivzVar instanceof ivz) {
                                                                                iC = l1d.C(((ivz) ivzVar).a);
                                                                                if (iC != 0) {
                                                                                    if (iC != 1) {
                                                                                        if (i4 != 2) {
                                                                                        }
                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                    }
                                                                                    if (iC != 2) {
                                                                                    }
                                                                                    Resources resources111111111111116 = r69Var.a;
                                                                                    return resources111111111111116.getString(2131958634, resources111111111111116.getString(2131958641));
                                                                                }
                                                                                if (i4 == 2) {
                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                }
                                                                            } else if (ivzVar != null) {
                                                                                eg.o();
                                                                            }
                                                                        } else if (h79Var instanceof y69) {
                                                                            ArrayList arrayList11112 = ((y69) h79Var).a;
                                                                            it8 = arrayList11112.iterator();
                                                                            i2 = 0;
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    next2 = it8.next();
                                                                                    i3 = i2 + 1;
                                                                                    if (i2 >= 0) {
                                                                                        p7h.T();
                                                                                        throw null;
                                                                                    }
                                                                                    x69 x69Var1119 = (x69) next2;
                                                                                    d10 = x69Var1119.a;
                                                                                    double d111111114 = x69Var1119.b;
                                                                                    if (dN >= d10) {
                                                                                    }
                                                                                    i2 = i3;
                                                                                } else {
                                                                                    next2 = null;
                                                                                }
                                                                            }
                                                                            x69Var = (x69) next2;
                                                                            if (x69Var != null) {
                                                                                double d111111115 = x69Var.a;
                                                                                dPow = (dN - d111111115) / (x69Var.b - d111111115);
                                                                                w69Var2 = x69Var.f;
                                                                                if (u890.j(w69Var2, t69Var)) {
                                                                                    if (w69Var2 instanceof u69) {
                                                                                        dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                    } else if (w69Var2 instanceof v69) {
                                                                                        dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i11111115 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i11111115);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111111118 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111111118.a, i4, hvzVar111111111111118.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources111111111111117 = r69Var.a;
                                                                                                return resources111111111111117.getString(2131958634, resources111111111111117.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    dValueOf = Double.valueOf(dPow);
                                                                                    if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                        dValueOf = null;
                                                                                    }
                                                                                    if (dValueOf != null) {
                                                                                        dDoubleValue = dValueOf.doubleValue();
                                                                                        int i11111116 = x69Var.e;
                                                                                        d8 = x69Var.d;
                                                                                        d9 = x69Var.c;
                                                                                        iC2 = l1d.C(i11111116);
                                                                                        if (iC2 != 0) {
                                                                                            dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                        } else if (iC2 == 1) {
                                                                                            dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        dValueOf2 = Double.valueOf(dPow2);
                                                                                        if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                            dValueOf2 = null;
                                                                                        }
                                                                                        if (dValueOf2 != null) {
                                                                                            hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar111111111111119 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar111111111111119.a, i4, hvzVar111111111111119.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources111111111111118 = r69Var.a;
                                                                                                return resources111111111111118.getString(2131958634, resources111111111111118.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eg.o();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        it5 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                x69 x69Var121 = (x69) it5.next();
                                                                d5 = x69Var121.a;
                                                                z2 = z;
                                                                arrayList4 = arrayList3;
                                                                double d211 = x69Var121.c;
                                                                double d212 = x69Var121.b;
                                                                double d213 = x69Var121.d;
                                                                if (Math.abs(d5) > Double.MAX_VALUE) {
                                                                }
                                                            } else {
                                                                z3 = z;
                                                                arrayList5 = arrayList3;
                                                                if (((x69) o7h.q0(arrayList5)).a <= d13) {
                                                                    listW1 = o7h.w1(arrayList5);
                                                                    if (listW1 instanceof Collection) {
                                                                        it6 = listW1.iterator();
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                mmr0Var = (mmr0) it6.next();
                                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                                }
                                                                            } else {
                                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                                it7 = arrayList2.iterator();
                                                                                do {
                                                                                    if (it7.hasNext()) {
                                                                                        next = it7.next();
                                                                                    } else {
                                                                                        next = null;
                                                                                    }
                                                                                    z69Var2 = (z69) next;
                                                                                    if (z69Var2 != null) {
                                                                                        f79Var2 = z69Var2.b;
                                                                                        if (f79Var2 instanceof d79) {
                                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                        } else if (f79Var2 instanceof e79) {
                                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1111111111111110 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1111111111111110.a, i4, hvzVar1111111111111110.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources111111111111119 = r69Var.a;
                                                                                                return resources111111111111119.getString(2131958634, resources111111111111119.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (z3) {
                                                                                        o69Var = (o69) h79Var;
                                                                                        if (dN <= 0.0d) {
                                                                                            dValueOf3 = null;
                                                                                        } else {
                                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                                dValueOf3 = null;
                                                                                            }
                                                                                        }
                                                                                        if (dValueOf3 != null) {
                                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1111111111111111 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1111111111111111.a, i4, hvzVar1111111111111111.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1111111111111110 = r69Var.a;
                                                                                                return resources1111111111111110.getString(2131958634, resources1111111111111110.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (h79Var instanceof y69) {
                                                                                        ArrayList arrayList11113 = ((y69) h79Var).a;
                                                                                        it8 = arrayList11113.iterator();
                                                                                        i2 = 0;
                                                                                        while (true) {
                                                                                            if (it8.hasNext()) {
                                                                                                next2 = it8.next();
                                                                                                i3 = i2 + 1;
                                                                                                if (i2 >= 0) {
                                                                                                    p7h.T();
                                                                                                    throw null;
                                                                                                }
                                                                                                x69 x69Var11110 = (x69) next2;
                                                                                                d10 = x69Var11110.a;
                                                                                                double d111111116 = x69Var11110.b;
                                                                                                if (dN >= d10) {
                                                                                                }
                                                                                                i2 = i3;
                                                                                            } else {
                                                                                                next2 = null;
                                                                                            }
                                                                                        }
                                                                                        x69Var = (x69) next2;
                                                                                        if (x69Var != null) {
                                                                                            double d111111117 = x69Var.a;
                                                                                            dPow = (dN - d111111117) / (x69Var.b - d111111117);
                                                                                            w69Var2 = x69Var.f;
                                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                                if (w69Var2 instanceof u69) {
                                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                                } else if (w69Var2 instanceof v69) {
                                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i11111117 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i11111117);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar1111111111111112 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar1111111111111112.a, i4, hvzVar1111111111111112.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources1111111111111111 = r69Var.a;
                                                                                                            return resources1111111111111111.getString(2131958634, resources1111111111111111.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i11111118 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i11111118);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar1111111111111113 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar1111111111111113.a, i4, hvzVar1111111111111113.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources1111111111111112 = r69Var.a;
                                                                                                            return resources1111111111111112.getString(2131958634, resources1111111111111112.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                } while (!g0p1.A((z69) next, dN));
                                                                                z69Var2 = (z69) next;
                                                                                if (z69Var2 != null) {
                                                                                    f79Var2 = z69Var2.b;
                                                                                    if (f79Var2 instanceof d79) {
                                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                    } else if (f79Var2 instanceof e79) {
                                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar1111111111111114 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar1111111111111114.a, i4, hvzVar1111111111111114.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources1111111111111113 = r69Var.a;
                                                                                            return resources1111111111111113.getString(2131958634, resources1111111111111113.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (z3) {
                                                                                    o69Var = (o69) h79Var;
                                                                                    if (dN <= 0.0d) {
                                                                                        dValueOf3 = null;
                                                                                    } else {
                                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                            dValueOf3 = null;
                                                                                        }
                                                                                    }
                                                                                    if (dValueOf3 != null) {
                                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar1111111111111115 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar1111111111111115.a, i4, hvzVar1111111111111115.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources1111111111111114 = r69Var.a;
                                                                                            return resources1111111111111114.getString(2131958634, resources1111111111111114.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (h79Var instanceof y69) {
                                                                                    ArrayList arrayList11114 = ((y69) h79Var).a;
                                                                                    it8 = arrayList11114.iterator();
                                                                                    i2 = 0;
                                                                                    while (true) {
                                                                                        if (it8.hasNext()) {
                                                                                            next2 = it8.next();
                                                                                            i3 = i2 + 1;
                                                                                            if (i2 >= 0) {
                                                                                                p7h.T();
                                                                                                throw null;
                                                                                            }
                                                                                            x69 x69Var11111 = (x69) next2;
                                                                                            d10 = x69Var11111.a;
                                                                                            double d111111118 = x69Var11111.b;
                                                                                            if (dN >= d10) {
                                                                                            }
                                                                                            i2 = i3;
                                                                                        } else {
                                                                                            next2 = null;
                                                                                        }
                                                                                    }
                                                                                    x69Var = (x69) next2;
                                                                                    if (x69Var != null) {
                                                                                        double d111111119 = x69Var.a;
                                                                                        dPow = (dN - d111111119) / (x69Var.b - d111111119);
                                                                                        w69Var2 = x69Var.f;
                                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                                            if (w69Var2 instanceof u69) {
                                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                            } else if (w69Var2 instanceof v69) {
                                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i11111119 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i11111119);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar1111111111111116 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar1111111111111116.a, i4, hvzVar1111111111111116.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources1111111111111115 = r69Var.a;
                                                                                                        return resources1111111111111115.getString(2131958634, resources1111111111111115.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i111111110 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i111111110);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar1111111111111117 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar1111111111111117.a, i4, hvzVar1111111111111117.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources1111111111111116 = r69Var.a;
                                                                                                        return resources1111111111111116.getString(2131958634, resources1111111111111116.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        it6 = listW1.iterator();
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                mmr0Var = (mmr0) it6.next();
                                                                                if (((x69) mmr0Var.a).b == ((x69) mmr0Var.b).a) {
                                                                                }
                                                                            } else {
                                                                                dN = yoi1.n(d4, s69Var.b, s69Var.c);
                                                                                it7 = arrayList2.iterator();
                                                                                do {
                                                                                    if (it7.hasNext()) {
                                                                                        next = it7.next();
                                                                                    } else {
                                                                                        next = null;
                                                                                    }
                                                                                    z69Var2 = (z69) next;
                                                                                    if (z69Var2 != null) {
                                                                                        f79Var2 = z69Var2.b;
                                                                                        if (f79Var2 instanceof d79) {
                                                                                            ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                        } else if (f79Var2 instanceof e79) {
                                                                                            ivzVar = new ivz(((e79) f79Var2).a);
                                                                                        } else {
                                                                                            eg.o();
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1111111111111118 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1111111111111118.a, i4, hvzVar1111111111111118.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1111111111111117 = r69Var.a;
                                                                                                return resources1111111111111117.getString(2131958634, resources1111111111111117.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (z3) {
                                                                                        o69Var = (o69) h79Var;
                                                                                        if (dN <= 0.0d) {
                                                                                            dValueOf3 = null;
                                                                                        } else {
                                                                                            dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                            dValueOf3 = Double.valueOf(dLog10);
                                                                                            if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                                dValueOf3 = null;
                                                                                            }
                                                                                        }
                                                                                        if (dValueOf3 != null) {
                                                                                            hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                            ivzVar = hvzVar;
                                                                                        }
                                                                                        if (ivzVar instanceof hvz) {
                                                                                            hvz hvzVar1111111111111119 = (hvz) ivzVar;
                                                                                            return r69Var.a(hvzVar1111111111111119.a, i4, hvzVar1111111111111119.b);
                                                                                        }
                                                                                        if (ivzVar instanceof ivz) {
                                                                                            iC = l1d.C(((ivz) ivzVar).a);
                                                                                            if (iC != 0) {
                                                                                                if (iC != 1) {
                                                                                                    if (i4 != 2) {
                                                                                                    }
                                                                                                    return r69Var.a(0.0d, i4, 1);
                                                                                                }
                                                                                                if (iC != 2) {
                                                                                                }
                                                                                                Resources resources1111111111111118 = r69Var.a;
                                                                                                return resources1111111111111118.getString(2131958634, resources1111111111111118.getString(2131958641));
                                                                                            }
                                                                                            if (i4 == 2) {
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                        } else if (ivzVar != null) {
                                                                                            eg.o();
                                                                                        }
                                                                                    } else if (h79Var instanceof y69) {
                                                                                        ArrayList arrayList11115 = ((y69) h79Var).a;
                                                                                        it8 = arrayList11115.iterator();
                                                                                        i2 = 0;
                                                                                        while (true) {
                                                                                            if (it8.hasNext()) {
                                                                                                next2 = it8.next();
                                                                                                i3 = i2 + 1;
                                                                                                if (i2 >= 0) {
                                                                                                    p7h.T();
                                                                                                    throw null;
                                                                                                }
                                                                                                x69 x69Var11112 = (x69) next2;
                                                                                                d10 = x69Var11112.a;
                                                                                                double d1111111110 = x69Var11112.b;
                                                                                                if (dN >= d10) {
                                                                                                }
                                                                                                i2 = i3;
                                                                                            } else {
                                                                                                next2 = null;
                                                                                            }
                                                                                        }
                                                                                        x69Var = (x69) next2;
                                                                                        if (x69Var != null) {
                                                                                            double d1111111111 = x69Var.a;
                                                                                            dPow = (dN - d1111111111) / (x69Var.b - d1111111111);
                                                                                            w69Var2 = x69Var.f;
                                                                                            if (u890.j(w69Var2, t69Var)) {
                                                                                                if (w69Var2 instanceof u69) {
                                                                                                    dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                                } else if (w69Var2 instanceof v69) {
                                                                                                    dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i111111111 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i111111111);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar11111111111111110 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar11111111111111110.a, i4, hvzVar11111111111111110.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources1111111111111119 = r69Var.a;
                                                                                                            return resources1111111111111119.getString(2131958634, resources1111111111111119.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                dValueOf = Double.valueOf(dPow);
                                                                                                if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                    dValueOf = null;
                                                                                                }
                                                                                                if (dValueOf != null) {
                                                                                                    dDoubleValue = dValueOf.doubleValue();
                                                                                                    int i111111112 = x69Var.e;
                                                                                                    d8 = x69Var.d;
                                                                                                    d9 = x69Var.c;
                                                                                                    iC2 = l1d.C(i111111112);
                                                                                                    if (iC2 != 0) {
                                                                                                        dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                    } else if (iC2 == 1) {
                                                                                                        dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                    } else {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                    dValueOf2 = Double.valueOf(dPow2);
                                                                                                    if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                        dValueOf2 = null;
                                                                                                    }
                                                                                                    if (dValueOf2 != null) {
                                                                                                        hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                        ivzVar = hvzVar;
                                                                                                    }
                                                                                                    if (ivzVar instanceof hvz) {
                                                                                                        hvz hvzVar11111111111111111 = (hvz) ivzVar;
                                                                                                        return r69Var.a(hvzVar11111111111111111.a, i4, hvzVar11111111111111111.b);
                                                                                                    }
                                                                                                    if (ivzVar instanceof ivz) {
                                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                                        if (iC != 0) {
                                                                                                            if (iC != 1) {
                                                                                                                if (i4 != 2) {
                                                                                                                }
                                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                                            }
                                                                                                            if (iC != 2) {
                                                                                                            }
                                                                                                            Resources resources11111111111111110 = r69Var.a;
                                                                                                            return resources11111111111111110.getString(2131958634, resources11111111111111110.getString(2131958641));
                                                                                                        }
                                                                                                        if (i4 == 2) {
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                    } else if (ivzVar != null) {
                                                                                                        eg.o();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                } while (!g0p1.A((z69) next, dN));
                                                                                z69Var2 = (z69) next;
                                                                                if (z69Var2 != null) {
                                                                                    f79Var2 = z69Var2.b;
                                                                                    if (f79Var2 instanceof d79) {
                                                                                        ivzVar = new hvz(((d79) f79Var2).a, 1);
                                                                                    } else if (f79Var2 instanceof e79) {
                                                                                        ivzVar = new ivz(((e79) f79Var2).a);
                                                                                    } else {
                                                                                        eg.o();
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar11111111111111112 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar11111111111111112.a, i4, hvzVar11111111111111112.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources11111111111111111 = r69Var.a;
                                                                                            return resources11111111111111111.getString(2131958634, resources11111111111111111.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (z3) {
                                                                                    o69Var = (o69) h79Var;
                                                                                    if (dN <= 0.0d) {
                                                                                        dValueOf3 = null;
                                                                                    } else {
                                                                                        dLog10 = Math.log10(dN / o69Var.a) * o69Var.b;
                                                                                        dValueOf3 = Double.valueOf(dLog10);
                                                                                        if (Math.abs(dLog10) > Double.MAX_VALUE) {
                                                                                            dValueOf3 = null;
                                                                                        }
                                                                                    }
                                                                                    if (dValueOf3 != null) {
                                                                                        hvzVar = new hvz(dValueOf3.doubleValue(), 1);
                                                                                        ivzVar = hvzVar;
                                                                                    }
                                                                                    if (ivzVar instanceof hvz) {
                                                                                        hvz hvzVar11111111111111113 = (hvz) ivzVar;
                                                                                        return r69Var.a(hvzVar11111111111111113.a, i4, hvzVar11111111111111113.b);
                                                                                    }
                                                                                    if (ivzVar instanceof ivz) {
                                                                                        iC = l1d.C(((ivz) ivzVar).a);
                                                                                        if (iC != 0) {
                                                                                            if (iC != 1) {
                                                                                                if (i4 != 2) {
                                                                                                }
                                                                                                return r69Var.a(0.0d, i4, 1);
                                                                                            }
                                                                                            if (iC != 2) {
                                                                                            }
                                                                                            Resources resources11111111111111112 = r69Var.a;
                                                                                            return resources11111111111111112.getString(2131958634, resources11111111111111112.getString(2131958641));
                                                                                        }
                                                                                        if (i4 == 2) {
                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                        }
                                                                                    } else if (ivzVar != null) {
                                                                                        eg.o();
                                                                                    }
                                                                                } else if (h79Var instanceof y69) {
                                                                                    ArrayList arrayList11116 = ((y69) h79Var).a;
                                                                                    it8 = arrayList11116.iterator();
                                                                                    i2 = 0;
                                                                                    while (true) {
                                                                                        if (it8.hasNext()) {
                                                                                            next2 = it8.next();
                                                                                            i3 = i2 + 1;
                                                                                            if (i2 >= 0) {
                                                                                                p7h.T();
                                                                                                throw null;
                                                                                            }
                                                                                            x69 x69Var11113 = (x69) next2;
                                                                                            d10 = x69Var11113.a;
                                                                                            double d1111111112 = x69Var11113.b;
                                                                                            if (dN >= d10) {
                                                                                            }
                                                                                            i2 = i3;
                                                                                        } else {
                                                                                            next2 = null;
                                                                                        }
                                                                                    }
                                                                                    x69Var = (x69) next2;
                                                                                    if (x69Var != null) {
                                                                                        double d1111111113 = x69Var.a;
                                                                                        dPow = (dN - d1111111113) / (x69Var.b - d1111111113);
                                                                                        w69Var2 = x69Var.f;
                                                                                        if (u890.j(w69Var2, t69Var)) {
                                                                                            if (w69Var2 instanceof u69) {
                                                                                                dPow = Math.pow(dPow, ((u69) w69Var2).a);
                                                                                            } else if (w69Var2 instanceof v69) {
                                                                                                dPow = 1.0d - Math.pow(1.0d - dPow, ((v69) w69Var2).a);
                                                                                            } else {
                                                                                                eg.o();
                                                                                            }
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i111111113 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i111111113);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar11111111111111114 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar11111111111111114.a, i4, hvzVar11111111111111114.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources11111111111111113 = r69Var.a;
                                                                                                        return resources11111111111111113.getString(2131958634, resources11111111111111113.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            dValueOf = Double.valueOf(dPow);
                                                                                            if (Math.abs(dPow) > Double.MAX_VALUE) {
                                                                                                dValueOf = null;
                                                                                            }
                                                                                            if (dValueOf != null) {
                                                                                                dDoubleValue = dValueOf.doubleValue();
                                                                                                int i111111114 = x69Var.e;
                                                                                                d8 = x69Var.d;
                                                                                                d9 = x69Var.c;
                                                                                                iC2 = l1d.C(i111111114);
                                                                                                if (iC2 != 0) {
                                                                                                    dPow2 = ((d8 - d9) * dDoubleValue) + d9;
                                                                                                } else if (iC2 == 1) {
                                                                                                    dPow2 = Math.pow(d8 / d9, dDoubleValue) * d9;
                                                                                                } else {
                                                                                                    eg.o();
                                                                                                }
                                                                                                dValueOf2 = Double.valueOf(dPow2);
                                                                                                if (Math.abs(dPow2) > Double.MAX_VALUE) {
                                                                                                    dValueOf2 = null;
                                                                                                }
                                                                                                if (dValueOf2 != null) {
                                                                                                    hvzVar = new hvz(dValueOf2.doubleValue(), x69Var.g);
                                                                                                    ivzVar = hvzVar;
                                                                                                }
                                                                                                if (ivzVar instanceof hvz) {
                                                                                                    hvz hvzVar11111111111111115 = (hvz) ivzVar;
                                                                                                    return r69Var.a(hvzVar11111111111111115.a, i4, hvzVar11111111111111115.b);
                                                                                                }
                                                                                                if (ivzVar instanceof ivz) {
                                                                                                    iC = l1d.C(((ivz) ivzVar).a);
                                                                                                    if (iC != 0) {
                                                                                                        if (iC != 1) {
                                                                                                            if (i4 != 2) {
                                                                                                            }
                                                                                                            return r69Var.a(0.0d, i4, 1);
                                                                                                        }
                                                                                                        if (iC != 2) {
                                                                                                        }
                                                                                                        Resources resources11111111111111114 = r69Var.a;
                                                                                                        return resources11111111111111114.getString(2131958634, resources11111111111111114.getString(2131958641));
                                                                                                    }
                                                                                                    if (i4 == 2) {
                                                                                                        return r69Var.a(0.0d, i4, 1);
                                                                                                    }
                                                                                                } else if (ivzVar != null) {
                                                                                                    eg.o();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    eg.o();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z = z2;
                                                            arrayList3 = arrayList4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                eg.o();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj4;
                }
                obj4 = null;
                ivzVar = obj4;
                if (ivzVar instanceof hvz) {
                    hvz hvzVar11111111111111116 = (hvz) ivzVar;
                    return r69Var.a(hvzVar11111111111111116.a, i4, hvzVar11111111111111116.b);
                }
                if (ivzVar instanceof ivz) {
                    iC = l1d.C(((ivz) ivzVar).a);
                    if (iC != 0) {
                        if (iC != 1) {
                            if (i4 != 2) {
                            }
                            return r69Var.a(0.0d, i4, 1);
                        }
                        if (iC != 2) {
                        }
                        Resources resources11111111111111115 = r69Var.a;
                        return resources11111111111111115.getString(2131958634, resources11111111111111115.getString(2131958641));
                    }
                    if (i4 == 2) {
                        return r69Var.a(0.0d, i4, 1);
                    }
                } else if (ivzVar != null) {
                    eg.o();
                }
                return obj4;
        }
    }
}
