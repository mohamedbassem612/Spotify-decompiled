package p;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l69 {
    public final BigDecimal a;
    public final Currency b;
    public final Bundle c;
    public final ylq0 d;

    public l69(BigDecimal bigDecimal, Currency currency, Bundle bundle, ylq0 ylq0Var) {
        this.a = bigDecimal;
        this.b = currency;
        this.c = bundle;
        this.d = ylq0Var;
    }

    public final Currency a() {
        return this.b;
    }

    public final ylq0 b() {
        return this.d;
    }

    public final Bundle c() {
        return this.c;
    }

    public final BigDecimal d() {
        return this.a;
    }
}
