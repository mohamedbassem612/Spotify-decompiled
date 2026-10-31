package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qeg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o3e0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qeg0(o3e0 o3e0Var, boolean z, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = o3e0Var;
        this.c = z;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        boolean z = this.c;
        o3e0 o3e0Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                i8h1 i8h1Var = (i8h1) ((idd1) o3e0Var.d).getValue();
                x6h1 x6h1VarC = ((tdl0) o3e0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("music_videos_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                char c = z ? (char) 2 : (char) 1;
                char c2 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str = "music_videos_off";
                if (c == 1) {
                    obj2 = "music_videos_off";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    obj2 = "music_videos_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj2);
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "music_videos_on";
                }
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(lfg0.a);
                return rih1Var;
            case 1:
                ((Boolean) obj).getClass();
                i8h1 i8h1Var2 = (i8h1) ((idd1) o3e0Var.d).getValue();
                x6h1 x6h1VarC2 = ((tdl0) o3e0Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("canvas_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                char c3 = z ? (char) 2 : (char) 1;
                char c4 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                String str2 = "canvas_off";
                if (c3 == 1) {
                    obj3 = "canvas_off";
                } else {
                    if (c3 != 2) {
                        throw null;
                    }
                    obj3 = "canvas_on";
                }
                mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj3);
                if (c4 != 1) {
                    if (c4 != 2) {
                        throw null;
                    }
                    str2 = "canvas_on";
                }
                i8h1Var2.m(new w7h1("", "", z7h1Var2, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str2)})), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(kfg0.a);
                return rih1Var;
            default:
                ((Boolean) obj).getClass();
                i8h1 i8h1Var3 = (i8h1) ((idd1) o3e0Var.d).getValue();
                x6h1 x6h1VarC3 = ((tdl0) o3e0Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("other_videos_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                char c5 = z ? (char) 2 : (char) 1;
                char c6 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                String str3 = "other_videos_off";
                if (c5 == 1) {
                    obj4 = "other_videos_off";
                } else {
                    if (c5 != 2) {
                        throw null;
                    }
                    obj4 = "other_videos_on";
                }
                mmr0 mmr0Var3 = new mmr0("state_before_toggle", obj4);
                if (c6 != 1) {
                    if (c6 != 2) {
                        throw null;
                    }
                    str3 = "other_videos_on";
                }
                i8h1Var3.m(new w7h1("", "", z7h1Var3, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var3, new mmr0("state_after_toggle", str3)})), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(mfg0.a);
                return rih1Var;
        }
    }
}
