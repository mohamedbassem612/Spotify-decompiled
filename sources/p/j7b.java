package p;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j7b implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public j7b(mxr mxrVar, fjl0 fjl0Var, String str) {
        this.a = (byte) 1;
        this.c = mxrVar;
        this.d = fjl0Var;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        byte b3 = 1;
        switch (b) {
            case 0:
                h7b h7bVar = (h7b) obj3;
                k7b k7bVar = (k7b) obj2;
                lzn0 lzn0Var = k7bVar.a;
                kt91 kt91Var = k7bVar.c;
                r630 r630Var = k7bVar.b;
                String str = (String) obj;
                if (r630Var.c(str) == null) {
                    r630Var.a(new i430(str, 30, false));
                }
                i7b i7bVar = k7bVar.f;
                if (i7bVar != null) {
                    r630Var.g(str, i7bVar);
                }
                i7b i7bVar2 = new i7b(k7bVar, b2);
                k7bVar.f = i7bVar2;
                r630Var.b(str, i7bVar2);
                r630Var.j(str, true);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959445});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131959445, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                fq7 fq7Var = h7bVar.a;
                if (fq7Var.equals(e7b.c)) {
                    kt91Var.o(er91Var);
                    lzn0Var.c();
                } else if (fq7Var.equals(f7b.c)) {
                    kt91Var.o(er91Var);
                    lzn0Var.e();
                } else if (!fq7Var.equals(g7b.c)) {
                    eg.o();
                } else {
                    kt91Var.k(er91Var);
                }
                break;
            case 1:
                mxr mxrVar = (mxr) obj2;
                i8h1 i8h1Var = (i8h1) mxrVar.a;
                fjl0 fjl0Var = (fjl0) obj3;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("confirm_deletion_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("confirm_deletion", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str2 = (String) obj;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_playlist", 1, Collections.singletonMap("playlist_to_be_deleted", str2)), x6h1VarC2.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q((dg30) mxrVar.b), (q8n) mxrVar.d, 0, new zlo(mxrVar, str2, (lnm) null, (byte) 24), 2);
                break;
            case 2:
                i8h1 i8h1Var2 = ((lt8) ((zeu) obj2).b).a;
                x6h1 x6h1VarC3 = cbp1.o().h().b.c();
                x6h1VarC3.i.add(new a7h1("confirm_remove_download_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", (String) obj)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((ohd) obj3).resumeWith(Boolean.TRUE);
                break;
            case 3:
                vx40 vx40Var = (vx40) obj2;
                i8h1 i8h1Var3 = (i8h1) vx40Var.c;
                x6h1 x6h1VarC4 = ((nqk0) obj).b.c();
                x6h1VarC4.i.add(new a7h1("positive_button", (String) null, (Integer) null, (String) null, "start_new_jam"));
                x6h1VarC4.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q((dg30) vx40Var.b), (o8n) null, 0, new no70((e4b) obj3, (lnm) null, (byte) 9), 3);
                break;
            case 4:
                ((iu30) obj2).invoke(new lpo0());
                lcs.b((Context) obj3, (lcs) ((res) obj).d);
                break;
            case 5:
                String strT = pro1.t("videoPodcastsDownloadAudioOnly");
                ax7 ax7Var = ((cs61) obj).c;
                i8h1 i8h1Var4 = (i8h1) ax7Var.a.get();
                uol0 uol0Var = ax7Var.b;
                uol0Var.getClass();
                x6h1 x6h1VarC5 = uol0Var.b.c();
                x6h1VarC5.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                ((SingleSubject) obj2).onSuccess(new vp61(strT, i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strT)), x6h1VarC5.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null)));
                ((l811) obj3).a = true;
                break;
            default:
                mgh1 mgh1Var = (mgh1) obj3;
                ngh1 ngh1Var = (ngh1) obj2;
                lzn0 lzn0Var2 = ngh1Var.a;
                kt91 kt91Var2 = ngh1Var.c;
                r630 r630Var2 = ngh1Var.b;
                String str3 = (String) obj;
                if (r630Var2.c(str3) == null) {
                    r630Var2.a(new i430(str3, 30, false));
                }
                i7b i7bVar3 = ngh1Var.f;
                if (i7bVar3 != null) {
                    r630Var2.g(str3, i7bVar3);
                }
                i7b i7bVar4 = new i7b(ngh1Var, b3);
                ngh1Var.f = i7bVar4;
                r630Var2.b(str3, i7bVar4);
                r630Var2.j(str3, false);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959456});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var2 = new er91((fs91) null, "", 2131959456, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                lgo1 lgo1Var = mgh1Var.a;
                if (lgo1Var.equals(jgh1.d)) {
                    kt91Var2.o(er91Var2);
                    lzn0Var2.c();
                } else if (lgo1Var.equals(kgh1.d)) {
                    kt91Var2.o(er91Var2);
                    lzn0Var2.e();
                } else if (!lgo1Var.equals(lgh1.d)) {
                    eg.o();
                } else {
                    kt91Var2.k(er91Var2);
                }
                break;
        }
    }

    public /* synthetic */ j7b(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
