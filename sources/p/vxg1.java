package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.musicvideos.listvideofirstimpl.VideoFirstProto;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vxg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxg1(boolean z, rk41 rk41Var, lz20 lz20Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 20;
        this.b = z;
        this.d = rk41Var;
        this.c = lz20Var;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                vxg1 vxg1Var = new vxg1(this.c, obj2, lnmVar, (byte) 0);
                vxg1Var.d = obj;
                return vxg1Var;
            case 1:
                return new vxg1((g7m1) this.c, (SceneTemplate.WrappedTwinContent.TelepathyCard) this.d, (rb90) obj2, lnmVar);
            case 2:
                vxg1 vxg1Var2 = new vxg1(this.c, obj2, lnmVar, (byte) 2);
                vxg1Var2.d = obj;
                return vxg1Var2;
            case 3:
                vxg1 vxg1Var3 = new vxg1((rah1) obj2, lnmVar);
                vxg1Var3.d = obj;
                return vxg1Var3;
            case 4:
                vxg1 vxg1Var4 = new vxg1(this.c, obj2, lnmVar, (byte) 4);
                vxg1Var4.d = obj;
                return vxg1Var4;
            case 5:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 5);
            case 6:
                vxg1 vxg1Var5 = new vxg1(this.c, obj2, lnmVar, (byte) 6);
                vxg1Var5.d = obj;
                return vxg1Var5;
            case 7:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 7);
            case 8:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 8);
            case 9:
                vxg1 vxg1Var6 = new vxg1(this.c, obj2, lnmVar, (byte) 9);
                vxg1Var6.d = obj;
                return vxg1Var6;
            case 10:
                vxg1 vxg1Var7 = new vxg1(this.c, obj2, lnmVar, (byte) 10);
                vxg1Var7.d = obj;
                return vxg1Var7;
            case 11:
                vxg1 vxg1Var8 = new vxg1(this.c, obj2, lnmVar, (byte) 11);
                vxg1Var8.d = obj;
                return vxg1Var8;
            case 12:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 12);
            case 13:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 13);
            case 14:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 14);
            case 15:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 15);
            case 16:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 16);
            case 17:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                vxg1 vxg1Var9 = new vxg1((String) this.c, this.b, (String) obj2, lnmVar);
                vxg1Var9.d = obj;
                return vxg1Var9;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 19);
            case 20:
                return new vxg1(this.b, (rk41) this.d, (lz20) this.c, (ven0) obj2, lnmVar);
            case 21:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 21);
            case 22:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 22);
            case 23:
                vxg1 vxg1Var10 = new vxg1(this.c, obj2, lnmVar, (byte) 23);
                vxg1Var10.d = obj;
                return vxg1Var10;
            case 24:
                vxg1 vxg1Var11 = new vxg1(this.c, obj2, lnmVar, (byte) 24);
                vxg1Var11.d = obj;
                return vxg1Var11;
            case 25:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 25);
            case 26:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 26);
            case 27:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 27);
            case 28:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 28);
            default:
                return new vxg1(this.d, this.c, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
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
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((VideoFirstProto.State) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:129:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:463:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x067c, code lost:
    
        if (r1 == r0) goto L295;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vxg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxg1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxg1(String str, boolean z, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 18;
        this.c = str;
        this.e = str2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxg1(rah1 rah1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.e = rah1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxg1(g7m1 g7m1Var, SceneTemplate.WrappedTwinContent.TelepathyCard telepathyCard, rb90 rb90Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = g7m1Var;
        this.d = telepathyCard;
        this.e = rb90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxg1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }
}
