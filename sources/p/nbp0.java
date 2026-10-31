package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nbp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbp0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new w((f8s) ((xcp0) obj).invoke(), (byte) 28);
            case 1:
                return new w((hqt) ((xcp0) obj).invoke());
            case 2:
                return new mtt((fut) ((xcp0) obj).invoke());
            case 3:
                return new mtt((sut) ((xcp0) obj).invoke());
            case 4:
                return new mtt((bvt) ((zcp0) obj).invoke());
            case 5:
                return new mtt((ezt) ((zcp0) obj).invoke());
            case 6:
                return new q((jvr) ((zcp0) obj).invoke());
            case 7:
                n25 n25Var = new n25(false, false, false, false, false, (feh1) ((kly0) ((yap0) obj).invoke()).get());
                s9e s9eVar = new s9e((byte) 2);
                n25Var.e();
                bpb1 bpb1Var = ycn0.b;
                Boolean boolValueOf = Boolean.valueOf(n25Var.e());
                bpb1Var.getClass();
                bpb1Var.m((Object) null, boolValueOf);
                bpb1 bpb1Var2 = ycn0.c;
                Boolean boolValueOf2 = Boolean.valueOf(n25Var.b());
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, boolValueOf2);
                bpb1 bpb1Var3 = ycn0.d;
                Boolean boolValueOf3 = Boolean.valueOf(n25Var.a());
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, boolValueOf3);
                bpb1 bpb1Var4 = ycn0.e;
                Boolean boolValueOf4 = Boolean.valueOf(n25Var.c());
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, boolValueOf4);
                bpb1 bpb1Var5 = ycn0.f;
                Boolean boolValueOf5 = Boolean.valueOf(n25Var.d());
                bpb1Var5.getClass();
                bpb1Var5.m((Object) null, boolValueOf5);
                return s9eVar;
            case 8:
                return new mtt((fuz) ((zcp0) obj).invoke());
            case 9:
                return new zc00(((wuk) ((u6j0) obj).b).f);
            case 10:
                return new mtt((hs00) ((zcp0) obj).invoke());
            case 11:
                return new mtt((i210) ((sbp0) obj).invoke());
            case 12:
                ((zcp0) obj).invoke();
                return new aa40();
            case 13:
                return new mtt((p250) ((zcp0) obj).invoke());
            case 14:
                return new mtt((c3s) ((zcp0) obj).invoke());
            case 15:
                return new mtt((f9c0) ((zcp0) obj).invoke());
            case 16:
                return new mtt(new lmw((qr90) ((fcp0) obj).invoke(), (byte) 28));
            case 17:
                return new srd0(((sap0) obj).b.d());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new mtt((o6s) ((zcp0) obj).invoke());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new vte0((Flowable) ((bbp0) obj).invoke());
            case 20:
                return new h1f0(new og4(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true, false, false, true, false, false, false, false, mg4.b, ng4.b, false, 5000, 5000, 5000, 5000, 5000, false, (xz11) ((xap0) obj).invoke()));
            case 21:
                return new mtt((ywh0) ((wbp0) obj).invoke());
            case 22:
                return new pyh0(((ucp0) obj).b.c);
            case 23:
                return new mtt((l8s) ((zcp0) obj).invoke());
            case 24:
                luk lukVar = (luk) ((ccp0) obj).invoke();
                return new flk0(new glk0(new drj0(new wx4(lukVar), new tp4(false, lukVar), (byte) 1).g()));
            case 25:
                return new mtt((x6m0) ((zcp0) obj).invoke());
            case 26:
                return new mtt((u2o0) ((zcp0) obj).invoke());
            case 27:
                return new mtt((y2o0) ((zcp0) obj).invoke());
            case 28:
                return new bap0(new q85(false, (xz11) ((hbp0) obj).invoke()));
            default:
                return new q((flp0) ((zcp0) obj).invoke());
        }
    }
}
