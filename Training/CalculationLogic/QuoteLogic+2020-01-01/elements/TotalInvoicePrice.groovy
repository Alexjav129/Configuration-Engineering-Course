if (null in [out.InvoicePrice, out.Quantity]) {
    api.addWarning("Total Invoice Price cannot be calculated: missing parameter(s)")
    return null
}

return out.InvoicePrice * out.Quantity