package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/z641;", "Lp/dwb;", "<init>", "()V", "src_main_java_com_spotify_partneraccountlinking_partneraccountlinking-partneraccountlinking"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class z641 extends dwb {
    public bjx V1;
    public a741 W1;
    public myq0 X1;
    public kt91 Y1;
    public lzn0 Z1;
    public slc0 a2;

    public final int b1() {
        return 2132018193;
    }

    public final Dialog c1(Bundle bundle) {
        cwb cwbVarC1 = super.c1(bundle);
        cwbVarC1.g().J(0);
        cwbVarC1.setOnShowListener(new li3(cwbVarC1, (byte) 1));
        cwbVarC1.g().t(new mi3(cwbVarC1, (byte) 2));
        return cwbVarC1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        bjx bjxVar = this.V1;
        if (bjxVar == null) {
            u890.C("partnerAccountLinkingDialogLogger");
            throw null;
        }
        i8h1 i8h1Var = (i8h1) bjxVar.d;
        x6h1 x6h1VarC = ((pdl0) bjxVar.e).b.c();
        x6h1VarC.i.add(new a7h1("account_linking_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void u0(int i, int i2, Intent intent) {
        super/*p.zf30*/.u0(i, i2, intent);
        Y0();
        if (i2 == -1) {
            kt91 kt91Var = this.Y1;
            if (kt91Var == null) {
                u890.C("snackbarManager");
                throw null;
            }
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961394});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.o(new er91((fs91) null, "", 2131961394, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = O0().getInt("times_dialog_shown");
        bjx bjxVar = this.V1;
        if (bjxVar == null) {
            u890.C("partnerAccountLinkingDialogLogger");
            throw null;
        }
        slc0 slc0Var = this.a2;
        if (slc0Var == null) {
            u890.C("linkingId");
            throw null;
        }
        ((CompositeDisposable) bjxVar.g).b(fq7.C((xov0) bjxVar.b).subscribe(new jjh0(bjxVar, i, slc0Var)));
        View viewInflate = layoutInflater.inflate(2131626165, viewGroup, false);
        ((Button) viewInflate.findViewById(2131429778)).setOnClickListener(new y641(this, (byte) 0));
        ((Button) viewInflate.findViewById(2131429728)).setOnClickListener(new y641(this, (byte) 1));
        return viewInflate;
    }
}
