package p;

import android.content.Context;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s73 extends a8d1 implements vu30 {
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public byte d;
    public /* synthetic */ Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(cy5 cy5Var, p311 p311Var, o811 o811Var, bpb1 bpb1Var, Context context, e421 e421Var, ove1 ove1Var, jve1 jve1Var, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.b = cy5Var;
        this.c = p311Var;
        this.f = o811Var;
        this.g = bpb1Var;
        this.h = context;
        this.i = e421Var;
        this.t = ove1Var;
        this.X = jve1Var;
        this.Y = c9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                x73 x73Var = (x73) this.h;
                lik1 lik1Var = (lik1) this.i;
                s73 s73Var = new s73((String) this.t, (String) this.X, x73Var, (mb3) obj2, lnmVar, lik1Var);
                s73Var.e = obj;
                return s73Var;
            case 1:
                s73 s73Var2 = new s73((SceneTemplate.ArtistCardsContent.Card2) this.t, (g7m1) this.X, (vh6) obj2, lnmVar);
                s73Var2.e = obj;
                return s73Var2;
            case 2:
                s73 s73Var3 = new s73((il71) this.g, (ahj1) this.h, (dhe) this.i, (wmy) obj2, lnmVar);
                s73Var3.e = obj;
                return s73Var3;
            case 3:
                s73 s73Var4 = new s73((cy5) this.b, (p311) this.c, (o811) this.f, (bpb1) this.g, (Context) this.h, (e421) this.i, (ove1) this.t, (jve1) this.X, (c9n) obj2, lnmVar);
                s73Var4.e = obj;
                return s73Var4;
            case 4:
                return new s73((s5k1) this.e, (iu30) this.h, (xwa) this.i, (vwa) this.t, (xwa) this.X, (xwa) obj2, lnmVar, (byte) 4);
            default:
                return new s73((iu30) this.e, (wkt) this.h, (s5k1) this.i, (xwa) this.t, (vwa) this.X, (xwa) obj2, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((l311) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0423  */
    /* JADX WARN: Code duplicated, block: B:127:0x0442  */
    /* JADX WARN: Code duplicated, block: B:155:0x0550  */
    /* JADX WARN: Code duplicated, block: B:158:0x056d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0664  */
    /* JADX WARN: Code duplicated, block: B:162:0x076a  */
    /* JADX WARN: Code duplicated, block: B:163:0x079d  */
    /* JADX WARN: Code duplicated, block: B:166:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:198:0x086e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0896  */
    /* JADX WARN: Code duplicated, block: B:208:0x0898  */
    /* JADX WARN: Code duplicated, block: B:212:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:215:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:218:0x08b6 A[LOOP:0: B:213:0x08a9->B:218:0x08b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:225:0x08dc A[LOOP:1: B:221:0x08d0->B:225:0x08dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:235:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:236:0x090c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0914  */
    /* JADX WARN: Code duplicated, block: B:240:0x095c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0987  */
    /* JADX WARN: Code duplicated, block: B:254:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:256:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:259:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:262:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:265:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:267:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:268:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:272:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:275:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:278:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:281:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:283:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:286:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:292:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:295:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:303:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:304:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:307:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:311:0x08b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x08c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x08df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x08f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0174  */
    /* JADX WARN: Code duplicated, block: B:93:0x0319  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0207, code lost:
    
        if (r4 == r7) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 2910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s73.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s73(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, xwa xwaVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.h = obj2;
        this.i = obj3;
        this.t = obj4;
        this.X = obj5;
        this.Y = xwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(String str, String str2, x73 x73Var, mb3 mb3Var, lnm lnmVar, lik1 lik1Var) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.h = x73Var;
        this.i = lik1Var;
        this.t = str;
        this.Y = mb3Var;
        this.X = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(SceneTemplate.ArtistCardsContent.Card2 card2, g7m1 g7m1Var, vh6 vh6Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.t = card2;
        this.X = g7m1Var;
        this.Y = vh6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(il71 il71Var, ahj1 ahj1Var, dhe dheVar, wmy wmyVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.g = il71Var;
        this.h = ahj1Var;
        this.i = dheVar;
        this.Y = wmyVar;
    }
}
