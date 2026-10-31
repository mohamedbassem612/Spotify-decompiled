package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jcs implements tbu0 {
    public final bnj0 a;
    public final Context b;
    public final fza1 c;
    public final zhq0 d;
    public final cfd e;

    public jcs(yxp yxpVar, zxp zxpVar, bnj0 bnj0Var, Context context, fza1 fza1Var) {
        this.a = bnj0Var;
        this.b = context;
        this.c = fza1Var;
        this.d = yxpVar.a("default");
        this.e = zxpVar.a("default");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:4:0x0018  */
    @Override // p.tbu0
    public final SpannableString a(PlayerState playerState, s6g1 s6g1Var) {
        jo70 jo70VarD;
        io70 io70Var;
        String strL;
        List list;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        String strF = f(playerState, s6g1Var);
        contextTrack.getClass();
        if (l4o1.v(contextTrack)) {
            boolean zU = l4o1.u(contextTrack);
            ktl ktlVar = ktl.b;
            if (zU && s6g1Var.a() == ktlVar) {
                jo70 jo70VarD2 = s6g1Var.d();
                if (jo70VarD2 == null || (list = jo70VarD2.d) == null) {
                    strL = null;
                } else {
                    strL = o7h.y0(list, ", ", null, null, c6s.W0, 30);
                }
            } else if (l4o1.v(contextTrack) && s6g1Var.a() == ktlVar && (!l4o1.u(contextTrack) || s6g1Var.a() != ktlVar)) {
                strL = l4o1.l(contextTrack);
            } else if (!l4o1.v(contextTrack) || s6g1Var.a() != ktl.c || (jo70VarD = s6g1Var.d()) == null || (io70Var = jo70VarD.e) == null) {
                strL = null;
            } else {
                strL = io70Var.a;
            }
            if (strL == null || strL.length() <= 0) {
                strL = null;
            }
        } else {
            strL = null;
        }
        String strContextUri = playerState.contextUri();
        fza1 fza1Var = this.c;
        boolean zB = fza1Var.b(strContextUri);
        Context context = this.b;
        if (zB) {
            return new SpannableString(context.getString(2131962870, fza1Var.a(playerState.contextUri())));
        }
        if (l4o1.Y(contextTrack)) {
            return new SpannableString(context.getString(2131959895));
        }
        if (strF != null) {
            return new SpannableString(strF);
        }
        if (strL != null) {
            return new SpannableString(strL);
        }
        if (l4o1.l(contextTrack).length() > 0) {
            return new SpannableString(l4o1.l(contextTrack));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // p.tbu0
    public final SpannableString b(PlayerState playerState, s6g1 s6g1Var) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        String strF = s6g1Var.f();
        if (strF == null) {
            contextTrack.getClass();
            strF = l4o1.f0(contextTrack);
            if (strF == null) {
                strF = "";
            }
        } else {
            if (strF.length() <= 0) {
                strF = null;
            }
            if (strF == null) {
                contextTrack.getClass();
                strF = l4o1.f0(contextTrack);
                if (strF == null) {
                    strF = "";
                }
            }
        }
        contextTrack.getClass();
        String strL = l4o1.l(contextTrack);
        if (this.c.b(playerState.contextUri())) {
            strF = strF.length() == 0 ? strL : f4i1.f(strF, " • ", strL);
        }
        SpannableString spannableString = new SpannableString(strF);
        spannableString.setSpan(new StyleSpan(1), 0, strF.length(), 33);
        return spannableString;
    }

    @Override // p.tbu0
    public final SpannableString c(PlayerState playerState) {
        if (!l4o1.S((ContextTrack) playerState.track().b())) {
            String strA = this.a.v(playerState).a();
            if (ihc1.y0(strA)) {
                strA = null;
            }
            if (strA != null) {
                return new SpannableString(strA);
            }
        }
        return null;
    }

    @Override // p.tbu0
    public final List d(PlayerState playerState, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (Boolean.parseBoolean((String) ((ContextTrack) playerState.track().b()).metadata().get("collection.can_add"))) {
            arrayList.add(this.e.v(playerState, bool));
        }
        zhq0 zhq0Var = this.d;
        arrayList.add(eio1.y(playerState, zhq0Var, true));
        arrayList.add(eio1.x(playerState, zhq0Var));
        arrayList.add(eio1.w(playerState, zhq0Var, true));
        return o7h.l1(arrayList);
    }

    @Override // p.tbu0
    public final boolean e(PlayerState playerState, s6g1 s6g1Var) {
        return true;
    }

    public final String f(PlayerState playerState, s6g1 s6g1Var) {
        jo70 jo70VarB;
        j341 j341VarJ;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        if (o4p1.u(playerState) || this.c.b(playerState.contextUri())) {
            return null;
        }
        contextTrack.getClass();
        if (l4o1.Y(contextTrack) || l4o1.G(contextTrack) || l4o1.E(contextTrack) || l4o1.L(contextTrack) || l4o1.v(contextTrack) || (jo70VarB = s6g1Var.b()) == null || (j341VarJ = cev0.J(jo70VarB, s6g1Var.a(), s6g1Var.e(), s6g1Var.c())) == null) {
            return null;
        }
        return j341VarJ.a(new i4o(this, (byte) 20));
    }
}
