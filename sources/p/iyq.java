package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iyq extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxq b;
    public final /* synthetic */ DataSectionType c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyq(xxq xxqVar, DataSectionType dataSectionType, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = xxqVar;
        this.c = dataSectionType;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        DataSectionType dataSectionType = this.c;
        xxq xxqVar = this.b;
        switch (b) {
            case 0:
                xxqVar.b(true, dataSectionType);
                iu30Var.invoke(new rxq(dataSectionType));
                break;
            default:
                xxqVar.b(false, dataSectionType);
                iu30Var.invoke(new rxq(dataSectionType));
                break;
        }
        return rih1Var;
    }
}
