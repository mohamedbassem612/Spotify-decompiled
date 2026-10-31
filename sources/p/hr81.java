package p;

import com.spotify.signup.signup.v2.proto.ClientInfo;
import com.spotify.signup.signup.v2.proto.Tracking;
import com.spotify.signup.signup.v2.proto.ValidateAccountRequest;
import com.spotify.signup.signup.v2.proto.ValidateAccountResponse;
import com.spotify.signup.signup.v2.proto.ValidationAccountField;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hr81 {
    public final br81 a;
    public final String b;
    public final String c;
    public final x2g1 d;
    public final idd1 e = new idd1(new fe81(this, (byte) 6));
    public final idd1 f = new idd1(gr81.b);

    public hr81(br81 br81Var, String str, String str2, x2g1 x2g1Var) {
        this.a = br81Var;
        this.b = str;
        this.c = str2;
        this.d = x2g1Var;
    }

    public final Observable a(tri1 tri1Var, String str) {
        rri1 rri1VarN = ValidationAccountField.n();
        rri1VarN.n(tri1Var.a);
        rri1VarN.q(str);
        ValidationAccountField validationAccountField = (ValidationAccountField) rri1VarN.build();
        fri1 fri1VarP = ValidateAccountRequest.p();
        fri1VarP.n(validationAccountField);
        fri1VarP.q((ClientInfo) this.e.getValue());
        fri1VarP.r((Tracking) this.f.getValue());
        ValidateAccountRequest validateAccountRequestBuild = fri1VarP.build();
        validateAccountRequestBuild.getClass();
        Observable observable = this.a.a(validateAccountRequestBuild).onErrorResumeNext(new dn81(ValidateAccountResponse.parser(), (byte) 1)).toObservable();
        int iOrdinal = tri1Var.ordinal();
        if (iOrdinal == 0) {
            return observable.map(new yjp1(str, (byte) 19));
        }
        if (iOrdinal == 1) {
            return observable.map(r3x0.N0);
        }
        if (iOrdinal == 2) {
            return observable.map(i2x0.X);
        }
        eg.o();
        return null;
    }
}
