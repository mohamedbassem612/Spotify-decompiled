package p;

import android.content.Context;
import android.widget.EditText;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xww implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yww b;

    public /* synthetic */ xww(yww ywwVar, byte b) {
        this.a = b;
        this.b = ywwVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        yww ywwVar = this.b;
        switch (b) {
            case 0:
                ywwVar.a.V0.onNext(new vp81(f0r0.b));
                break;
            case 1:
                y3u y3uVar = ywwVar.c;
                String str = ((tww) obj).a;
                bpb1 bpb1Var = y3uVar.g;
                Context context = y3uVar.a;
                bpb1Var.m((Object) null, new j0f0(context.getString(2131962502), context.getString(2131962501), null, new h0f0(context.getString(2131962482), new w3u(y3uVar, str, (byte) 0)), new h0f0(context.getString(2131962480), new w3u(y3uVar, str, (byte) 1)), null, new x3u(y3uVar, (byte) 0), new w3u(y3uVar, str, (byte) 2), 36));
                break;
            case 2:
                sww swwVar = (sww) obj;
                bzw bzwVar = ywwVar.b;
                if (bzwVar != null) {
                    String str2 = swwVar.a;
                    EditText editText = ((azw) bzwVar).e;
                    if (ihc1.e1(str2).toString().length() > 0) {
                        if (editText.getText().length() == 0 || !editText.getText().equals(str2)) {
                            editText.setText(str2);
                            editText.setSelection(str2.length());
                            break;
                        }
                    }
                }
                break;
            default:
                nfb nfbVar = ywwVar.f;
                ywwVar.d.onNext(new xp81(new pjn0(nfb.h(((pww) obj).a), false)));
                break;
        }
    }
}
