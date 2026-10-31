package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nap0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new q((Set) ((pbp0) obj).invoke());
            case 1:
                return new w((kwc1) ((vcp0) obj).invoke());
            case 2:
                return new w((lk) ((vcp0) obj).invoke());
            case 3:
                return new w((pnr) ((vcp0) obj).invoke());
            case 4:
                return new gg8(((vap0) obj).b.b());
            case 5:
                return new tg8((di8) ((c42) ((u6j0) obj).b).q);
            case 6:
                return new zh8(((vap0) obj).b.b());
            case 7:
                return new w((d89) ((vcp0) obj).invoke());
            case 8:
                return ((uv40) obj).a;
            case 9:
                return new w((hir) ((vcp0) obj).invoke());
            case 10:
                return new w((gkb) ((qbp0) obj).invoke());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new qbd((Context) ((edp0) obj).invoke());
            case grn1.d /* 12 */:
                return new jfd((Context) ((edp0) obj).invoke());
            case 13:
                return new w((h0l) ((vcp0) obj).invoke());
            case 14:
                return new w((knr) ((vcp0) obj).invoke());
            case 15:
                return new w((rtz) ((vcp0) obj).invoke(), (byte) 13);
            case 16:
                return new w((qig) ((xcp0) obj).invoke());
            case 17:
                return new w((sor) ((xcp0) obj).invoke());
            case 18:
                return new w((zor) ((xcp0) obj).invoke());
            case 19:
                return new w((bpr) ((xcp0) obj).invoke());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new w((vtk1) ((xcp0) obj).invoke());
            case 21:
                return new w((fpr) ((xcp0) obj).invoke());
            case 22:
                return new b8n((a8n) ((xap0) obj).invoke());
            case 23:
                return new c8n((a8n) ((xap0) obj).invoke());
            case 24:
                return new w((Set) ((abp0) obj).invoke());
            case 25:
                return new w((vdr) ((xcp0) obj).invoke());
            case 26:
                return new w((agr) ((xcp0) obj).invoke());
            case 27:
                return new w((bor) ((xcp0) obj).invoke());
            case 28:
                return new w((apr) ((xcp0) obj).invoke());
            default:
                return new w((lur) ((xcp0) obj).invoke(), (byte) 27);
        }
    }
}
