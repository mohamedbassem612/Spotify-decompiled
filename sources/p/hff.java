package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hff extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hff(boolean z, Function0 function0, Function0 function1, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 19;
        this.b = z;
        this.c = function0;
        this.d = function1;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 0);
            case 1:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 1);
            case 2:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 2);
            case 3:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 4);
            case 5:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                hff hffVar = new hff(obj3, lnmVar, obj2, (byte) 6);
                hffVar.c = obj;
                return hffVar;
            case 7:
                hff hffVar2 = new hff(obj3, obj2, lnmVar, (byte) 7);
                hffVar2.c = obj;
                return hffVar2;
            case 8:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 11);
            case 12:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                hff hffVar3 = new hff(obj3, lnmVar, obj2, (byte) 13);
                hffVar3.c = obj;
                return hffVar3;
            case 14:
                hff hffVar4 = new hff(obj3, lnmVar, obj2, (byte) 14);
                hffVar4.c = obj;
                return hffVar4;
            case 15:
                hff hffVar5 = new hff(obj3, obj2, lnmVar, (byte) 15);
                hffVar5.c = obj;
                return hffVar5;
            case 16:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 16);
            case 17:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new hff(this.b, (Function0) this.c, (Function0) obj3, (ven0) obj2, lnmVar);
            case 20:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 20);
            case 21:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 21);
            case 22:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 22);
            case 23:
                hff hffVar6 = new hff(obj3, lnmVar, obj2, (byte) 23);
                hffVar6.c = obj;
                return hffVar6;
            case 24:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 25);
            case 26:
                hff hffVar7 = new hff(obj3, obj2, lnmVar, (byte) 26);
                hffVar7.c = obj;
                return hffVar7;
            case 27:
                return new hff(this.c, obj3, obj2, lnmVar, (byte) 27);
            case 28:
                return new hff(obj3, obj2, lnmVar, (byte) 28);
            default:
                hff hffVar8 = new hff(obj3, obj2, lnmVar, (byte) 29);
                hffVar8.c = obj;
                return hffVar8;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.appauthorization.sso.ClientIdentity$ValidationException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:197:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:226:0x0509  */
    /* JADX WARN: Code duplicated, block: B:415:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c9 -> B:35:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:415:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 2142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hff.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hff(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hff(Object obj, lnm lnmVar, Object obj2, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hff(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
