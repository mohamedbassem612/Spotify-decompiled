package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bff extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ uvk0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bff(cir0 cir0Var, uvk0 uvk0Var, Function0 function0, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = cir0Var;
        this.c = uvk0Var;
        this.d = function0;
        this.e = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        ven0 ven0Var = this.e;
        b7x b7xVar = b7x.a;
        uvk0 uvk0Var = this.c;
        cir0 cir0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1VarH = cwl1.H(cir0Var.g());
                uvk0Var.getClass();
                x6h1 x6h1VarC = uvk0Var.a.c();
                x6h1VarC.i.add(new a7h1("media_picker_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("os_photo_gallery_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarH.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_image_picker", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 1:
                i8h1 i8h1VarH2 = cwl1.H(cir0Var.g());
                uvk0Var.getClass();
                x6h1 x6h1VarC3 = uvk0Var.a.c();
                x6h1VarC3.i.add(new a7h1("media_picker_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("os_video_gallery_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1VarH2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_image_picker", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 2:
                i8h1 i8h1VarH3 = cwl1.H(cir0Var.g());
                uvk0Var.getClass();
                x6h1 x6h1VarC5 = uvk0Var.a.c();
                x6h1VarC5.i.add(new a7h1("media_picker_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("photo_camera_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1VarH3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("launch_camera", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            default:
                i8h1 i8h1VarH4 = cwl1.H(cir0Var.g());
                uvk0Var.getClass();
                x6h1 x6h1VarC7 = uvk0Var.a.c();
                x6h1VarC7.i.add(new a7h1("media_picker_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("video_camera_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                i8h1VarH4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("launch_camera", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
