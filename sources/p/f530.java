package p;

import com.spotify.gamesservice.musicguesser.v1.GetGameResponse;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f530 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f530(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public static final void e(ii60 ii60Var, ki60 ki60Var, ssw0 ssw0Var, l811 l811Var, l811 l811Var2) {
        if (l811Var.a || l811Var2.a) {
            return;
        }
        l811Var.a = true;
        fn31.T(ii60Var.e, (o8n) null, 0, new xtz(ii60Var, ki60Var, ssw0Var, (lnm) null, (byte) 12), 3);
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                f530 f530Var = new f530((g7h) this.e, (String) obj2, lnmVar, (byte) 0);
                f530Var.d = obj;
                return f530Var;
            case 1:
                return new f530(this.d, (String) obj2, this.e, lnmVar, (byte) 1);
            case 2:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 2);
            case 3:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 3);
            case 4:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 4);
            case 5:
                f530 f530Var2 = new f530((d340) this.e, (String) obj2, lnmVar, (byte) 5);
                f530Var2.d = obj;
                return f530Var2;
            case 6:
                f530 f530Var3 = new f530((GetGameResponse) this.e, (d340) obj2, lnmVar, (byte) 6);
                f530Var3.d = obj;
                return f530Var3;
            case 7:
                f530 f530Var4 = new f530((d340) this.e, (ArrayList) obj2, lnmVar, (byte) 7);
                f530Var4.d = obj;
                return f530Var4;
            case 8:
                f530 f530Var5 = new f530((w940) obj2, lnmVar, (byte) 8);
                f530Var5.d = obj;
                return f530Var5;
            case 9:
                return new f530(this.d, (String) obj2, this.e, lnmVar, (byte) 9);
            case 10:
                return new f530((bbc) obj2, lnmVar, (byte) 10);
            case 11:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 11);
            case 12:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 12);
            case 13:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 13);
            case 14:
                f530 f530Var6 = new f530((and) this.e, (wmd) obj2, lnmVar, (byte) 14);
                f530Var6.d = obj;
                return f530Var6;
            case 15:
                f530 f530Var7 = new f530((ii60) this.e, (ki60) obj2, lnmVar, (byte) 15);
                f530Var7.d = obj;
                return f530Var7;
            case 16:
                f530 f530Var8 = new f530((ii60) this.e, (li60) obj2, lnmVar, (byte) 16);
                f530Var8.d = obj;
                return f530Var8;
            case 17:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 17);
            case 18:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 18);
            case 19:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 19);
            case 20:
                f530 f530Var9 = new f530((lw70) this.e, (String) obj2, lnmVar, (byte) 20);
                f530Var9.d = obj;
                return f530Var9;
            case 21:
                f530 f530Var10 = new f530((LinkedHashMap) this.e, (o860) obj2, lnmVar, (byte) 21);
                f530Var10.d = obj;
                return f530Var10;
            case 22:
                f530 f530Var11 = new f530((y880) this.e, (gpt) obj2, lnmVar, (byte) 22);
                f530Var11.d = obj;
                return f530Var11;
            case 23:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 23);
            case 24:
                return new f530(this.d, (String) obj2, this.e, lnmVar, (byte) 24);
            case 25:
                return new f530(this.d, (String) obj2, this.e, lnmVar, (byte) 25);
            case 26:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 26);
            case 27:
                return new f530(this.d, (String) obj2, this.e, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 28);
            default:
                return new f530(this.d, this.e, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0699 */
    /* JADX WARN: Code duplicated, block: B:396:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:398:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:401:0x08fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v154, types: [p.tg80] */
    /* JADX WARN: Type inference failed for: r0v155, types: [p.tg80] */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v172 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v37, types: [p.jfe] */
    /* JADX WARN: Type inference failed for: r2v39, types: [p.bbc] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [p.jfe] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:256:0x06b9 -> B:258:0x06bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:308:0x077d -> B:301:0x075e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:397:0x08e8 -> B:399:0x08ec). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f530.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f530(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f530(Object obj, String str, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = str;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f530(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
