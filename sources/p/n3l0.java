package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n3l0 implements n8h1 {
    public final y6h1 a;

    public n3l0(o3l0 o3l0Var, int i, Integer num) {
        String str;
        x6h1 x6h1VarC = o3l0Var.a.c();
        switch (i) {
            case 1:
                str = "blend";
                break;
            case 2:
                str = "bluejay";
                break;
            case 3:
                str = "collaborative_playlist";
                break;
            case 4:
                str = "euterpe";
                break;
            case 5:
                str = "experimental";
                break;
            case 6:
                str = "jam";
                break;
            case 7:
                str = "kallax";
                break;
            case 8:
                str = "magpie";
                break;
            case 9:
                str = "mixed_playlist";
                break;
            case 10:
                str = "playlist";
                break;
            case 11:
                str = "prompt_playlist";
                break;
            case 12:
                str = "skubb";
                break;
            case 13:
                str = "sts_import_local_files";
                break;
            default:
                throw null;
        }
        x6h1VarC.i.add(new a7h1("menu_item", str, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
