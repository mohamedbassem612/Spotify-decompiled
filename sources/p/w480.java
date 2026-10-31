package p;

import android.view.View;
import android.widget.PopupMenu;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.legacyglue.icons.SpotifyIconView;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w480 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ InAppBrowserActivity b;

    public /* synthetic */ w480(InAppBrowserActivity inAppBrowserActivity, byte b) {
        this.a = b;
        this.b = inAppBrowserActivity;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.Context, com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        InAppBrowserActivity inAppBrowserActivity = this.b;
        switch (b) {
            case 0:
                c580 c580VarP0 = inAppBrowserActivity.p0();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new e580(2131427473, 2131951788, new CharSequence[0]));
                k9r k9rVarA = c580VarP0.a();
                if (k9rVarA != null) {
                    String str = (String) ((idd1) k9rVarA.d).getValue();
                    arrayList.add(str == null ? new e580(2131427453, 2131951773, new CharSequence[0]) : new e580(2131427453, 2131951774, str));
                }
                arrayList.add(new e580(2131427465, 2131951777, new CharSequence[0]));
                arrayList.add(new e580(2131427477, 2131951791, new CharSequence[0]));
                ?? r9 = c580VarP0.a;
                SpotifyIconView spotifyIconView = r9.m1;
                if (spotifyIconView == null) {
                    u890.C("optionsButton");
                    throw null;
                }
                PopupMenu popupMenu = new PopupMenu(r9, spotifyIconView);
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    e580 e580Var = (e580) obj;
                    int i3 = e580Var.b;
                    CharSequence[] charSequenceArr = (CharSequence[]) e580Var.c.toArray(new CharSequence[0]);
                    popupMenu.getMenu().add(0, e580Var.a, i, r9.getString(i3, Arrays.copyOf(charSequenceArr, charSequenceArr.length)));
                    i = i2;
                }
                popupMenu.setOnMenuItemClickListener(new x480(r9));
                popupMenu.show();
                return;
            case 1:
                inAppBrowserActivity.p0().a.finish();
                return;
            default:
                inAppBrowserActivity.p0().g();
                return;
        }
    }
}
