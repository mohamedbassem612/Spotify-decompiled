package p;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.emoji2.emojipicker.EmojiView;
import app.p000rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p4x implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p4x(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                q4x q4xVar = (q4x) obj2;
                q4xVar.h = !q4xVar.h;
                q4xVar.v1();
                q4xVar.f.removeViews(1, q4xVar.T0() - 1);
                q4xVar.w0();
                ((AppCompatImageView) obj).announceForAccessibility(q4xVar.c.getString(2131955449));
                return;
            case 1:
                o5x o5xVar = (o5x) obj2;
                View view2 = (View) obj;
                String strValueOf = String.valueOf(((EmojiView) view).getEmoji());
                o5xVar.W0.invoke(o5xVar, strValueOf);
                o5xVar.V0.invoke(o5xVar, o5x.E(strValueOf));
                r2a1 r2a1Var = o5xVar.U0;
                p5x p5xVar = o5xVar.Z0;
                if (p5xVar == null) {
                    u890.C("emojiViewItem");
                    throw null;
                }
                String str = (String) p5xVar.b.get(0);
                Map map = (Map) ((idd1) r2a1Var.c).getValue();
                if (str.equals(strValueOf)) {
                    map.remove(str);
                } else {
                    map.put(str, strValueOf);
                }
                ((SharedPreferences) r2a1Var.b).edit().putString("pref_key_sticky_variant", o7h.y0(map.entrySet(), "|", (String) null, (String) null, (iu30) null, 62)).commit();
                otu otuVar = o5xVar.a1;
                if (otuVar == null) {
                    u890.C("emojiPickerPopupViewController");
                    throw null;
                }
                PopupWindow popupWindow = (PopupWindow) otuVar.c;
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                view2.sendAccessibilityEvent(SemanticState.Focused);
                return;
            default:
                y570 y570Var = (y570) obj2;
                l670 l670Var = (l670) obj;
                if (y570Var.j().containsKey("click")) {
                    l670Var.c.d(new u570("click", y570Var, gg11.g));
                    return;
                }
                me70 me70VarT = y570Var.t();
                if (me70VarT != null) {
                    l670Var.b.f(me70VarT);
                    return;
                }
                return;
        }
    }
}
