package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kpv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mpv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpv(mpv mpvVar, byte b) {
        super(0);
        this.a = b;
        this.b = mpvVar;
    }

    public final Object invoke() {
        byte b = this.a;
        mpv mpvVar = this.b;
        switch (b) {
            case 0:
                jcp jcpVar = mpvVar.X1;
                if (jcpVar == null) {
                    u890.C("loggerFactory");
                    throw null;
                }
                String str = (String) mpvVar.a2.getValue();
                String str2 = (String) mpvVar.b2.getValue();
                i8h1 i8h1Var = (i8h1) ((npv) ((b6p) jcpVar.a.b).b).a.get();
                c8o.l(i8h1Var);
                return new opv(str, str2, i8h1Var);
            case 1:
                return mpvVar.O0().getString("edit_message_id");
            case 2:
                return mpvVar.O0().getString("page_id");
            case 3:
                return mpvVar.O0().getString("playlist_uri");
            default:
                return mpvVar.O0().getString("view_uri");
        }
    }
}
