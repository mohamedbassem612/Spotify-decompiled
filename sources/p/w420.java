package p;

import android.content.Context;
import j$.time.Clock;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w420 implements vyx0 {
    public final File a;
    public final Clock b;
    public final HashMap c;

    public w420(Context context) {
        File file = new File(context.getApplicationContext().getFilesDir(), "prompt_suggestions");
        file.mkdirs();
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        this.a = file;
        this.b = clockSystemDefaultZone;
        this.c = new HashMap();
    }

    public final boolean a(String str, String str2, ArrayList arrayList) {
        boolean z;
        synchronized (this) {
            v420 v420VarC = c(str);
            v420VarC.a();
            if (v420VarC.b(str2)) {
                v420VarC.c = this.b.millis();
                tyx0 tyx0Var = new tyx0(arrayList);
                v420VarC.b = tyx0Var;
                v420VarC.c(tyx0Var);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean b(String str, String str2) {
        boolean z;
        synchronized (this) {
            v420 v420VarC = c(str);
            v420VarC.a();
            if (v420VarC.b(str2)) {
                v420VarC.c = this.b.millis();
                ryx0 ryx0Var = new ryx0("fetch_failed");
                v420VarC.b = ryx0Var;
                v420VarC.c(ryx0Var);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final v420 c(String str) {
        HashMap map = this.c;
        Object v420Var = map.get(str);
        if (v420Var == null) {
            v420Var = new v420(this, new File(this.a, str.concat(".store")));
            map.put(str, v420Var);
        }
        return (v420) v420Var;
    }
}
