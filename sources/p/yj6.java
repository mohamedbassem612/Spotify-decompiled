package p;

import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yj6 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public byte b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;
    public int f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(List list, vna1 vna1Var, hla hlaVar, hla hlaVar2, t45 t45Var, VoiceAssistantLoggingContext voiceAssistantLoggingContext, CommandPlayRequest commandPlayRequest, lnm lnmVar) {
        super(2, lnmVar);
        this.t = list;
        this.h = vna1Var;
        this.i = hlaVar;
        this.c = hlaVar2;
        this.X = t45Var;
        this.e = voiceAssistantLoggingContext;
        this.d = commandPlayRequest;
    }

    public static final Object e(gw70 gw70Var, bju bjuVar, int i, Image image, String str, a8d1 a8d1Var) {
        if (image.getUrl().length() <= 0) {
            image = null;
        }
        if (image == null) {
            return null;
        }
        return u3k.a.l(image, gw70Var, bjuVar, "artist_card_sticker_" + str + "_" + i, a8d1Var);
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.X;
        switch (b) {
            case 0:
                yj6 yj6Var = new yj6((SceneTemplate.ArtistCardsContent.BonusCard) obj3, (bju) obj2, this.f, (gw70) this.d, lnmVar);
                yj6Var.c = obj;
                return yj6Var;
            case 1:
                yj6 yj6Var2 = new yj6((SceneTemplate.ArtistCardsContent.ArtistCard) obj3, (gw70) this.d, (bju) obj2, this.f, lnmVar);
                yj6Var2.c = obj;
                return yj6Var2;
            case 2:
                yj6 yj6Var3 = new yj6(this.g, lnmVar, (gp0) this.h, (q8n) this.i, (add) this.t, (bfd) obj3, (s1q0) obj2);
                yj6Var3.c = obj;
                return yj6Var3;
            case 3:
                return new yj6((ylk0) this.c, (String) this.h, (List) this.t, (List) obj3, (dqa1) obj2, (String) this.i, (ddd1) this.d, lnmVar);
            case 4:
                yj6 yj6Var4 = new yj6((pt) this.t, (c0y0) obj3, (iu30) obj2, (wzx0) this.d, lnmVar);
                yj6Var4.c = obj;
                return yj6Var4;
            default:
                return new yj6((List) this.t, (vna1) this.h, (hla) this.i, (hla) this.c, (t45) obj3, (VoiceAssistantLoggingContext) obj2, (CommandPlayRequest) this.d, lnmVar);
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x028d  */
    /* JADX WARN: Code duplicated, block: B:118:0x028f A[PHI: r3
      0x028f: PHI (r3v25 p.mw51) = (r3v24 p.mw51), (r3v27 p.mw51) binds: [B:102:0x025d, B:116:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x029e A[PHI: r1 r2
      0x029e: PHI (r1v44 java.lang.Object) = (r1v43 java.lang.Object), (r1v49 java.lang.Object) binds: [B:120:0x029b, B:92:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r2v39 int) = (r2v33 int), (r2v45 int) binds: [B:120:0x029b, B:92:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:160:0x035a  */
    /* JADX WARN: Code duplicated, block: B:161:0x036b  */
    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Code duplicated, block: B:189:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[PHI: r7 r12
      0x007e: PHI (r7v28 java.util.Iterator) = (r7v29 java.util.Iterator), (r7v32 java.util.Iterator) binds: [B:17:0x007a, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r12v13 int) = (r12v17 int), (r12v22 int) binds: [B:17:0x007a, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb A[PHI: r12
      0x00bb: PHI (r12v12 com.spotify.voiceassistants.playermodels.CommandPlayResponse) = 
      (r12v14 com.spotify.voiceassistants.playermodels.CommandPlayResponse)
      (r12v19 com.spotify.voiceassistants.playermodels.CommandPlayResponse)
      (r12v19 com.spotify.voiceassistants.playermodels.CommandPlayResponse)
     binds: [B:15:0x005d, B:23:0x00aa, B:25:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0282, code lost:
    
        if (r2 == r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r1 == r10) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c5, code lost:
    
        if (p.l4p1.q((p.mr20) r9, r19, r27) == r10) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:22:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yj6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(SceneTemplate.ArtistCardsContent.BonusCard bonusCard, bju bjuVar, int i, gw70 gw70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = bonusCard;
        this.e = bjuVar;
        this.f = i;
        this.d = gw70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(Object obj, lnm lnmVar, gp0 gp0Var, q8n q8nVar, add addVar, bfd bfdVar, s1q0 s1q0Var) {
        super(2, lnmVar);
        this.g = obj;
        this.h = gp0Var;
        this.i = q8nVar;
        this.t = addVar;
        this.X = bfdVar;
        this.e = s1q0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(SceneTemplate.ArtistCardsContent.ArtistCard artistCard, gw70 gw70Var, bju bjuVar, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.X = artistCard;
        this.d = gw70Var;
        this.e = bjuVar;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(pt ptVar, c0y0 c0y0Var, iu30 iu30Var, wzx0 wzx0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = ptVar;
        this.X = c0y0Var;
        this.e = iu30Var;
        this.d = wzx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj6(ylk0 ylk0Var, String str, List list, List list2, dqa1 dqa1Var, String str2, ddd1 ddd1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = ylk0Var;
        this.h = str;
        this.t = list;
        this.X = list2;
        this.e = dqa1Var;
        this.i = str2;
        this.d = ddd1Var;
    }
}
