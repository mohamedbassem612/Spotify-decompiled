package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ok5 implements uk5, DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ok5(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // p.uk5
    public boolean a() {
        vh3 vh3Var = (vh3) this.b;
        if (vh3Var != null) {
            return vh3Var.isShowing();
        }
        return false;
    }

    @Override // p.uk5
    public Drawable b() {
        return null;
    }

    @Override // p.uk5
    public int c() {
        return 0;
    }

    @Override // p.uk5
    public void dismiss() {
        vh3 vh3Var = (vh3) this.b;
        if (vh3Var != null) {
            vh3Var.dismiss();
            this.b = null;
        }
    }

    @Override // p.uk5
    public CharSequence e() {
        return (CharSequence) this.d;
    }

    @Override // p.uk5
    public void f(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // p.uk5
    public void i(int i, int i2) {
        vk5 vk5Var = (vk5) this.e;
        if (((pk5) this.c) == null) {
            return;
        }
        uh3 uh3Var = new uh3(vk5Var.getPopupContext());
        CharSequence charSequence = (CharSequence) this.d;
        if (charSequence != null) {
            uh3Var.setTitle(charSequence);
        }
        pk5 pk5Var = (pk5) this.c;
        int selectedItemPosition = vk5Var.getSelectedItemPosition();
        qh3 qh3Var = uh3Var.a;
        qh3Var.f120p = pk5Var;
        qh3Var.q = this;
        qh3Var.t = selectedItemPosition;
        qh3Var.s = true;
        vh3 vh3VarCreate = uh3Var.create();
        this.b = vh3VarCreate;
        AlertController$RecycleListView alertController$RecycleListView = vh3VarCreate.f.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        ((vh3) this.b).show();
    }

    @Override // p.uk5
    public int j() {
        return 0;
    }

    @Override // p.uk5
    public void k(ListAdapter listAdapter) {
        this.c = (pk5) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vk5 vk5Var = (vk5) obj;
                vk5Var.setSelection(i);
                if (vk5Var.getOnItemClickListener() != null) {
                    vk5Var.performItemClick(null, i, ((pk5) this.c).getItemId(i));
                }
                dismiss();
                break;
            case 1:
                int i2 = ((zce) ((yce) this.b).a.get(i)).c;
                if (i2 == 2131428575) {
                    ((DialogInterface.OnClickListener) this.c).onClick(dialogInterface, i);
                    break;
                } else if (i2 == 2131428577) {
                    ((DialogInterface.OnClickListener) this.d).onClick(dialogInterface, i);
                    break;
                } else if (i2 == 2131428576 && (onClickListener = (DialogInterface.OnClickListener) obj) != null) {
                    onClickListener.onClick(dialogInterface, i);
                    break;
                }
                break;
            case 2:
                dxy dxyVar = (dxy) this.b;
                kkb kkbVar = (kkb) dxyVar.c;
                String str = (String) this.c;
                i8h1 i8h1Var = kkbVar.a;
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-entity-dialogs-leave-playlist";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("leave_playlist_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("confirm_leave_playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_playlist", 1, Collections.singletonMap("playlist", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q((dg30) dxyVar.d), null, 0, new z290(dxyVar, str, (String) this.d, (qxc0) obj, (lnm) null, (byte) 6), 3);
                break;
            case 3:
                lis lisVar = (lis) this.b;
                i8h1 i8h1Var2 = lisVar.a;
                x6h1 x6h1VarC3 = lisVar.c.b.c();
                x6h1VarC3.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("discard_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                ((j2u) this.c).C();
                if (((fyw0) this.d).a) {
                    ((ma41) obj).g.onNext(db41.a);
                }
                break;
            default:
                ((SingleSubject) this.b).onSuccess(new op61((String) this.c));
                ax7 ax7Var = ((cs61) this.d).c;
                i8h1 i8h1Var3 = (i8h1) ax7Var.a.get();
                uol0 uol0Var = ax7Var.b;
                uol0Var.getClass();
                x6h1 x6h1VarC5 = uol0Var.b.c();
                x6h1VarC5.i.add(new a7h1("download_video_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null);
                ((l811) obj).a = true;
                break;
        }
    }

    public ok5(vk5 vk5Var) {
        this.a = (byte) 0;
        this.e = vk5Var;
    }

    @Override // p.uk5
    public void d(int i) {
    }

    @Override // p.uk5
    public void g(int i) {
    }

    @Override // p.uk5
    public void h(int i) {
    }

    @Override // p.uk5
    public void o(Drawable drawable) {
    }
}
