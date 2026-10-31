package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fxl1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ fxl1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    d441VarG1.K(1, str);
                    d441VarG1.f1();
                    return rih1.a;
                } finally {
                    d441VarG1.close();
                }
            default:
                d441 d441VarG2 = ((y341) obj).g1("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    d441VarG2.K(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG2.f1()) {
                        arrayList.add(d441VarG2.P0(0));
                    }
                    d441VarG2.close();
                    return arrayList;
                } catch (Throwable th) {
                    d441VarG2.close();
                    throw th;
                }
        }
    }
}
