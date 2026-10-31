package p;

import com.spotify.gamesservice.musicguesser.v1.GetGameResponse;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ie6 extends a8d1 implements vu30 {
    public final /* synthetic */ Object N0;
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public l2t b;
    public l2t c;
    public Object d;
    public byte e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie6(String str, ArrayList arrayList, d340 d340Var, ArrayList arrayList2, GetGameResponse getGameResponse, ArrayList arrayList3, lnm lnmVar) {
        super(2, lnmVar);
        this.i = str;
        this.t = arrayList;
        this.X = d340Var;
        this.Y = arrayList2;
        this.Z = getGameResponse;
        this.N0 = arrayList3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.N0;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                ie6 ie6Var = new ie6((SceneTemplate.ArtistCardsContent.Card3) obj4, (g7m1) obj3, (oe6) obj2, lnmVar);
                ie6Var.d = obj;
                return ie6Var;
            default:
                ie6 ie6Var2 = new ie6((String) this.i, (ArrayList) this.t, (d340) this.X, (ArrayList) obj4, (GetGameResponse) obj3, (ArrayList) obj2, lnmVar);
                ie6Var2.h = obj;
                return ie6Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00fe A[PHI: r1 r2 r3
      0x00fe: PHI (r1v31 java.util.Map) = (r1v30 java.util.Map), (r1v36 java.util.Map) binds: [B:27:0x00fb, B:12:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r2v32 p.l2t) = (r2v31 p.l2t), (r2v36 p.l2t) binds: [B:27:0x00fb, B:12:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v25 java.lang.Object) binds: [B:27:0x00fb, B:12:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0241  */
    /* JADX WARN: Code duplicated, block: B:62:0x0264  */
    /* JADX WARN: Code duplicated, block: B:66:0x028c  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        if (r0 == r6) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ie6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie6(SceneTemplate.ArtistCardsContent.Card3 card3, g7m1 g7m1Var, oe6 oe6Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = card3;
        this.Z = g7m1Var;
        this.N0 = oe6Var;
    }
}
