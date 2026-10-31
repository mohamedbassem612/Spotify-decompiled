package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p.crm0;
import p.d1p1;
import p.drm0;
import p.hzh;
import p.ixo1;
import p.vno1;
import p.vzh;
import p.w1x0;
import p.wct;
import p.zbp1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        hzh hzhVarA = vzh.a(drm0.class);
        hzhVarA.a(new wct(crm0.class, 2, 0));
        hzhVarA.f = w1x0.e1;
        vzh vzhVarB = hzhVarA.b();
        ixo1 ixo1Var = d1p1.b;
        Object[] objArr = {vzhVarB};
        vno1.r(objArr);
        return new zbp1(1, objArr);
    }
}
