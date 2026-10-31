package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.campaigns.videoview.VideoView;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k6g1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6g1(List list, n6g1 n6g1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = list;
        this.c = n6g1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new k6g1((n6g1) this.c, (String) obj2, lnmVar, (byte) 0);
            case 1:
                return new k6g1((List) obj2, (n6g1) this.c, lnmVar);
            case 2:
                k6g1 k6g1Var = new k6g1(obj2, lnmVar, (byte) 2);
                k6g1Var.c = obj;
                return k6g1Var;
            case 3:
                return new k6g1((npg1) this.c, (bst) obj2, lnmVar, (byte) 3);
            case 4:
                k6g1 k6g1Var2 = new k6g1(obj2, lnmVar, (byte) 4);
                k6g1Var2.c = obj;
                return k6g1Var2;
            case 5:
                return new k6g1((mrg1) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                k6g1 k6g1Var3 = new k6g1(obj2, lnmVar, (byte) 6);
                k6g1Var3.c = obj;
                return k6g1Var3;
            case 7:
                return new k6g1((o93) this.c, (hti0) obj2, lnmVar, (byte) 7);
            case 8:
                k6g1 k6g1Var4 = new k6g1(obj2, lnmVar, (byte) 8);
                k6g1Var4.c = obj;
                return k6g1Var4;
            case 9:
                return new k6g1((bvg1) this.c, (Function0) obj2, lnmVar, (byte) 9);
            case 10:
                return new k6g1((r091) this.c, (j5h1) obj2, lnmVar, (byte) 10);
            case 11:
                return new k6g1((rah1) this.c, (obh1) obj2, lnmVar, (byte) 11);
            case 12:
                return new k6g1((dlg1) this.c, (String) obj2, lnmVar, (byte) 12);
            case 13:
                return new k6g1((dlg1) this.c, (String) obj2, lnmVar, (byte) 13);
            case 14:
                k6g1 k6g1Var5 = new k6g1(obj2, lnmVar, (byte) 14);
                k6g1Var5.c = obj;
                return k6g1Var5;
            case 15:
                k6g1 k6g1Var6 = new k6g1(obj2, lnmVar, (byte) 15);
                k6g1Var6.c = obj;
                return k6g1Var6;
            case 16:
                k6g1 k6g1Var7 = new k6g1(obj2, lnmVar, (byte) 16);
                k6g1Var7.c = obj;
                return k6g1Var7;
            case 17:
                return new k6g1((w9i1) this.c, (List) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new k6g1((w9i1) this.c, (File) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new k6g1((w9i1) this.c, (String) obj2, lnmVar, (byte) 19);
            case 20:
                return new k6g1((xtb0) this.c, (wen0) obj2, lnmVar, (byte) 20);
            case 21:
                return new k6g1(obj2, lnmVar, (byte) 21);
            case 22:
                k6g1 k6g1Var8 = new k6g1(obj2, lnmVar, (byte) 22);
                k6g1Var8.c = obj;
                return k6g1Var8;
            case 23:
                return new k6g1(obj2, lnmVar, (byte) 23);
            case 24:
                return new k6g1((li0) this.c, (fv0) obj2, lnmVar, (byte) 24);
            case 25:
                return new k6g1((hce1) this.c, (vn3) obj2, lnmVar, (byte) 25);
            case 26:
                return new k6g1((ptf1) this.c, (String) obj2, lnmVar, (byte) 26);
            case 27:
                return new k6g1((ioj1) this.c, (mr20) obj2, lnmVar, (byte) 27);
            case 28:
                k6g1 k6g1Var9 = new k6g1((hec) this.c, (VideoView) obj2, lnmVar, (byte) 28);
                k6g1Var9.b = ((Boolean) obj).booleanValue();
                return k6g1Var9;
            default:
                return new k6g1((zoj1) this.c, (VideoView) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((k6g1) create((String) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                return ((k6g1) create((t7g1) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 9:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
            case 11:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((k6g1) create((List) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((k6g1) create((ssw0) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((k6g1) create((v7a) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 27:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((k6g1) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((k6g1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:127:0x0289  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:132:0x029b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:429:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0287 -> B:128:0x028b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k6g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6g1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6g1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
