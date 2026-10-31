package p;

import android.widget.Button;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pq91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qq91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq91(qq91 qq91Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qq91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qq91 qq91Var = this.c;
        switch (b) {
            case 0:
                pq91 pq91Var = new pq91(qq91Var, lnmVar, (byte) 0);
                pq91Var.b = obj;
                return pq91Var;
            default:
                pq91 pq91Var2 = new pq91(qq91Var, lnmVar, (byte) 1);
                pq91Var2.b = obj;
                return pq91Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = (String) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(str, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(str, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qq91 qq91Var = this.c;
        String str = (String) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                qq91Var.Z0().U(new khv0("phone_number_otp", 4, (Map) null, "whatsapp_otp_autofill_used"));
                ((OtpInputView) qq91Var.Y0().f).setOtp(str);
                ((Button) qq91Var.Y0().i).post(new nq91(qq91Var, (byte) 2));
                break;
            default:
                hm5.M(obj);
                qq91Var.Z0().U(new jhv0("phone_number_otp", "whatsapp_otp_processing_failed", 4, str));
                break;
        }
        return rih1Var;
    }
}
